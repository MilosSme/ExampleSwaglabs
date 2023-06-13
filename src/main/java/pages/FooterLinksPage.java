package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class FooterLinksPage {
    public WebDriver driver;

    public By twitter = By.xpath("//*[text()=\"Twitter\"]");
    public By twitterPageText = By.xpath("//*[text()=\"Људи на Твитеру први сазнају.\"]");
    public String realTwitterUrl = "https://twitter.com/saucelabs";
    public By facebook=By.xpath("//*[text()=\"Facebook\"]");
    public String realFacebookUrl="https://www.facebook.com/saucelabs";
    public By facebookPageText=By.xpath("//*[@style=\"-moz-box-orient: vertical; -webkit-line-clamp: 2; display: -webkit-box;\"][text()=\"Повежите се са корисником Sauce Labs на Фејсбуку\"]");
    public By linkedin=By.xpath("//*[text()=\"LinkedIn\"]");
    public String realLinkedinUrl="https://www.linkedin.com/company/sauce-labs/";
    public By linkedinPageText=By.tagName("h2");
    public String realLinkedinPageText="Sign in to see who you already know at Sauce Labs ";
    public void setTwitter() throws InterruptedException {
        driver.findElement(twitter).click();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);
        Thread.sleep(3000);
        returnTwitterUrl();
        validationTwitterPageText();
        driver.switchTo().window(parentWindow);
    }
    public boolean returnTwitterUrl() {
        return driver.getCurrentUrl().equals(realTwitterUrl);
    }
    public boolean validationTwitterPageText(){
        return driver.findElement(twitterPageText).getText().contains("на Твитеру");
    }
    public void setFacebook () throws InterruptedException {
        driver.findElement(facebook).click();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);
        Thread.sleep(3000);
        returnFacebookUrl();
        validationFacebookPageText();
        driver.switchTo().window(parentWindow);
    }
    public boolean returnFacebookUrl() {
        return driver.getCurrentUrl().equals(realFacebookUrl);
    }
    public boolean validationFacebookPageText(){
        return driver.findElement(facebookPageText).isDisplayed();
    }
    public void setLinkedin () throws InterruptedException {
        driver.findElement(linkedin).click();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);
        Thread.sleep(3000);
        returnLinkedinUrl();
        validationLinkedinPageText();
        driver.switchTo().window(parentWindow);
    }
    public boolean returnLinkedinUrl() {
        return driver.getCurrentUrl().equals(realLinkedinUrl);
    }
    public boolean validationLinkedinPageText(){
        return driver.findElement(linkedinPageText).equals(realLinkedinPageText);
    }
    public FooterLinksPage(WebDriver driver) {
            this.driver = driver;
        }

    }
