package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LeicaTMirrorlessDigitalCameraPage extends Utils{
    private By _greenBarClose = By.xpath("//span[@class= 'close']");
    By _productname = By.xpath("//div[@class='product-name']/h1"); // not private as we comparew with cartpage
    private By _AddToCart = By.xpath("//div[@class='add-to-cart']/div/button");
    By _shoppingCart = By.xpath("//span[@class='cart-label']");  // not private as we compare with cartpage

    public void leicaCameraAddToCartAndShoppingCart() {

        String productname = getTextFromElement(_productname);

    //print Leica camera
        System.out.println("Print Product Name: " +productname);

    //click on Add to cart button
    clickOnElement(_AddToCart);

    clickOnElement(_greenBarClose);


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    //click on shopping cart on top right corner
    clickOnElement(_shoppingCart);










//        public void clickonShoppingCart(){
//            //click on green popup window
//
//            clickOnElement(_clickOnShoppingCartLink);
//        }
//        private  By _clickOnShoppingCartLink = By.xpath("//div[@class=\"bar-notification success\"]/p/a[@href=\"/cart\"]");
//

}
}
