package apTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;
import pages.SuccessfulShoppingAction;

public class TestSuccessfulShopping extends BaseTest{
    LoginPage login=new LoginPage(driver);
    SuccessfulShoppingAction shopping=new SuccessfulShoppingAction(driver);

    @Before
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(5000);
    }

    @Test
    public void testSuccessfulShopingProduct() {
        login.loginProcess(login.userNameValue, login.passwordValue);
        shopping.shoppingProductSauceLabsBikeLight();
        Assert.assertTrue("Test faild",shopping.returnValidationSuccessfulShoppingProduct().contains("Thank you"));
    }

    @Test
    public void testShoppingProductSuccessfulSummationThePrice() {
        login.loginProcess("standard_user", "secret_sauce");
        shopping.shoppingProductSuccessfulSummationThePrice();
        shopping.returnSummaryTotalLabel();
    }
}
