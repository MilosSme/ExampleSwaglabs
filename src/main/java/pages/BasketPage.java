package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {
    public WebDriver driver;

    public By productSauceLabsBoltTShirt=By.xpath("//*[text()=\"Sauce Labs Bolt T-Shirt\"]");
    public By addToCart=By.xpath("//*[text()=\"Add to cart\"]");
    public By backToProducts=By.xpath("//*[@name=\"back-to-products\"]");
    public By productSauceLabsFleeceJacket=By.xpath("//*[text()=\"Sauce Labs Fleece Jacket\"]");
    public By yourCartBasket=By.cssSelector("a[class=\"shopping_cart_link\"]");
    public By cartList=By.cssSelector("div[class=\"cart_list\"]");
    public By removeProductSauceLabsBoltTShirt=By.xpath("//*[@data-test=\"remove-sauce-labs-bolt-t-shirt\"]");
    public By removeProductSauceLabsFleeceJacket=By.xpath("//*[@data-test=\"remove-sauce-labs-fleece-jacket\"]");
    public By checkingEmptyCart=By.id("cart_contents_container");
    public void addToCartProducts(){
        driver.findElement(productSauceLabsBoltTShirt).click();
        driver.findElement(addToCart).click();
        driver.findElement(backToProducts).click();
        driver.findElement(productSauceLabsFleeceJacket).click();
        driver.findElement(addToCart).click();
        driver.findElement(yourCartBasket).click();
    }
    public boolean returnCartListProductsDisplayed(){
        return driver.findElement(cartList).isDisplayed();
    }
    public void removeAddToCartProducts(){
        driver.findElement(yourCartBasket).click();
        driver.findElement(removeProductSauceLabsBoltTShirt).click();
        driver.findElement(removeProductSauceLabsFleeceJacket).click();
    }
    public boolean returnCheckingEmptyCartDisplayed (){
        return driver.findElement(checkingEmptyCart).isDisplayed();
    }
    public BasketPage(WebDriver driver){
        this.driver=driver;
    }













}
