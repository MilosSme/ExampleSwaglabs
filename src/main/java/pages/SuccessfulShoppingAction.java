package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulShoppingAction {

    public WebDriver driver;

    public By productSauceLabsBikeLight=By.xpath("//*[text()=\"Sauce Labs Bike Light\"]");
    public By addToCart=By.xpath("//*[text()=\"Add to cart\"]");
    public By yourCartBasket=By.xpath("//*[@class=\"shopping_cart_link\"]");
    public By checkout=By.xpath("//*[@data-test=\"checkout\"]");
    public By enterFirstName=By.xpath("//*[@placeholder=\"First Name\"]");
    public String firsNameValue="Milos";
    public By enterLastName=By.xpath("//*[@placeholder=\"Last Name\"]");
    public String lastNameValue="Likic";
    public By enterZipPostalCode=By.xpath("//*[@placeholder=\"Zip/Postal Code\"]");
    public String zipPostalCodeValue="11000";
    public By clikContinueButton=By.xpath("//*[@type=\"submit\"]");
    public By clicFinish=By.xpath("//*[@data-test=\"finish\"]");
    public By validationSuccessfulShoppingProduct=By.xpath("//*[text()=\"Thank you for your order!\"]");
    public By productSauceLabsBackpack=By.xpath("//*[text()=\"Sauce Labs Backpack\"]");
    public By backToProducts=By.xpath("//*[@data-test=\"back-to-products\"]");
    public By productSauceLabsOnesie=By.xpath("//*[text()=\"Sauce Labs Onesie\"]");
    public By summaryTotalLabel=By.xpath("//*[@class=\"summary_info_label summary_total_label\"]");
    public String realSummaryTotalLabel="Total: $41.02";

    public void shoppingProductSauceLabsBikeLight(){
        driver.findElement(productSauceLabsBikeLight).click();
        driver.findElement(addToCart).click();
        driver.findElement(yourCartBasket).click();
        driver.findElement(checkout).click();
        driver.findElement(enterFirstName).sendKeys(firsNameValue);
        driver.findElement(enterLastName).sendKeys(lastNameValue);
        driver.findElement(enterZipPostalCode).sendKeys(zipPostalCodeValue);
        driver.findElement(clikContinueButton).click();
        driver.findElement(clicFinish).click();
    }
    public String returnValidationSuccessfulShoppingProduct(){
        return driver.findElement(validationSuccessfulShoppingProduct).getText();
    }
    public void shoppingProductSuccessfulSummationThePrice(){
        driver.findElement(productSauceLabsBackpack).click();
        driver.findElement(addToCart).click();
        driver.findElement(backToProducts).click();
        driver.findElement(productSauceLabsOnesie).click();
        driver.findElement(addToCart).click();
        driver.findElement(yourCartBasket).click();
        driver.findElement(checkout).click();
        driver.findElement(enterFirstName).sendKeys(firsNameValue);
        driver.findElement(enterLastName).sendKeys(lastNameValue);
        driver.findElement(enterZipPostalCode).sendKeys(zipPostalCodeValue);
        driver.findElement(clikContinueButton).click();
    }
    public boolean returnSummaryTotalLabel(){
        return driver.findElement(summaryTotalLabel).equals(realSummaryTotalLabel);
    }
    public SuccessfulShoppingAction(WebDriver driver){
      this.driver=driver;
  }





}
