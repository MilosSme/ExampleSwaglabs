package apTests;

import org.junit.*;
import pages.LoginPage;

public class TestLoginPage extends BaseTest {
    LoginPage login = new LoginPage(driver);

    @Before
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(5000);
    }

    @Test
    public void testloginSuccessfullyUrl() {
        login.loginProcess(login.userNameValue, login.passwordValue);
        login.validationLoginPage();
        js.executeScript("window.scrollBy(0,2000)", "");
        Assert.assertEquals("Test faild", login.returnFooterText(), login.realFooterText);
        driver.navigate().back();
    }

    @Test
    public void testLoginInvalidUserName() {
        login.loginProcess(login.randomUserNamesValue(), login.passwordValue);
        login.returnInvalidLoginText();
        driver.navigate().back();
    }

    @Test
    public void testLoginInvalidPassword() {
        login.loginProcess(login.userNameValue, login.randomPasswordValue());
        Assert.assertTrue("Test faild", login.returnInvalidLoginTextByCSS().contains("do not match"));
        driver.navigate().back();
    }

    @Test
    public void testLoginUserNameIsRequired() {
        login.loginProcess("", login.passwordValue);
        if (login.returnLoginUserNameIsRequired().equals(login.loginUserNameIsRequiredText)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test faild");
            driver.navigate().back();
        }
    }

    @Test
    public void testLoginPasswordIsRequired() {
        login.loginProcess(login.userNameValue, "");
        login.returnLoginPasswordIsRequired();
        driver.navigate().back();
    }
}
