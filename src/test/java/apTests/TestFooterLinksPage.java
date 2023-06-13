package apTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.FooterLinksPage;
import pages.LoginPage;

public class TestFooterLinksPage extends BaseTest{
    LoginPage login=new LoginPage(driver);
    FooterLinksPage footer=new FooterLinksPage(driver);

    @Before
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(5000);
    }

    @Test
    public void testSuccessfulTwitterlink() throws InterruptedException {
        login.loginProcess("standard_user", "secret_sauce");
        js.executeScript("window.scrollBy(0,2000)", "");
        footer.setTwitter();
    }

    @Test
    public void testSuccessfulFacebooklink() throws InterruptedException {
        login.loginProcess("standard_user", "secret_sauce");
        js.executeScript("window.scrollBy(0,2000)", "");
        footer.setFacebook();
    }

    @Test
    public void testSuccessfulLinkedinlink() throws InterruptedException {
        login.loginProcess("standard_user", "secret_sauce");
        js.executeScript("window.scrollBy(0,2000)", "");
        footer.setLinkedin();
    }
}
