package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver driver;
    Faker faker=new Faker();

    public By userName = By.xpath("//input[@placeholder=\"Username\"]");
    public String userNameValue="standard_user";
    public By password = By.name("password");
    public String passwordValue="secret_sauce";
    public By submitButton = By.xpath("//*[@data-test=\"login-button\"]");
    public String realUrl="https://www.saucedemo.com/inventory.html";
    public By webElementLogo=By.xpath("//*[@class=\"app_logo\"][text()=\"Swag Labs\"]");
    public By footerText=By.xpath("//*[@class=\"footer_copy\"]");
    public String realFooterText="© 2023 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
    public By invalidUserName=By.tagName("h3");
    public By invalidLoginTextByCSS=By.cssSelector("h3[data-test=\"error\"]");
    public By loginUserNameIsRequired=By.xpath("//*[text()=\"Epic sadface: Username is required\"]");
    public String loginUserNameIsRequiredText="Epic sadface: Username is required";
    public By loginPasswordIsRequired= By.xpath("//*[text()=\"Epic sadface: Password is required\"]");
    public void loginProcess(String inputUserName, String inputPassword) {
        driver.findElement(userName).sendKeys(inputUserName);
        driver.findElement(password).sendKeys(inputPassword);
        driver.findElement(submitButton).click();
    }

    public boolean returnUrl(){
        return driver.getCurrentUrl().equals(realUrl);
    }
    public Boolean returnDisplayed(){
        return driver.findElement(webElementLogo).isDisplayed();
    }
    public void validationLoginPage(){
        returnUrl();
        returnDisplayed();
    }
    public String returnFooterText(){
        return driver.findElement(footerText).getText();
    }
    public String randomUserNamesValue(){
        return faker.name().username();
    }
    public boolean returnInvalidLoginText(){
        return driver.findElement(invalidUserName).isDisplayed();
    }
    public String randomPasswordValue(){
        return faker.toString();
    }
    public String returnInvalidLoginTextByCSS(){
        return driver.findElement(invalidLoginTextByCSS).getText();
    }
    public String returnLoginUserNameIsRequired(){
        return driver.findElement(loginUserNameIsRequired).getText();
    }
    public boolean returnLoginPasswordIsRequired() {
        return driver.findElement(loginPasswordIsRequired).isDisplayed();
    }

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }


}














