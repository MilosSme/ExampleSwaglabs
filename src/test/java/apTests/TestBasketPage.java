package apTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.BasketPage;
import pages.LoginPage;

public class TestBasketPage extends BaseTest{
    LoginPage login=new LoginPage(driver);
    BasketPage basket=new BasketPage(driver);

    @Before
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(5000);
    }

    @Test
    public void testSuccessfulAddingProductsToCart() {
        login.loginProcess(login.userNameValue, login.passwordValue);
        basket.addToCartProducts();
        basket.returnCartListProductsDisplayed();
    }
    @Test
    public void testSuccessfulRemoveProductsFromTheCart() {
        login.loginProcess(login.userNameValue, login.passwordValue);
        basket.removeAddToCartProducts();
        basket.returnCheckingEmptyCartDisplayed();
    }
}
