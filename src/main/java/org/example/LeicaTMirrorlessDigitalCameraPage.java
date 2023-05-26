package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LeicaTMirrorlessDigitalCameraPage extends Utils{
    private By _greenBarClose = By.cssSelector("span.close");
    By _productname = By.xpath("//div[@class='product-name']/h1"); // not private as we comparew with cartpage
    private By _AddToCart = By.xpath("//div[@class='add-to-cart']/div/button");
    By _shoppingCart = By.xpath("//span[text()='Shopping cart']");  // not private as we compare with cartpage
    private  By _clickOnShoppingCartLink = By.xpath("//div[@class=\"bar-notification success\"]/p/a[@href=\"/cart\"]");
    public void leicaCameraAddToCartAndShoppingCart() {

        String productname = getTextFromElement(_productname);

    //print Leica camera
        System.out.println("Print Product Name: " +productname);

    //click on Add to cart button
    clickOnElement(_AddToCart);

    //click on shopping cart on green bar
    clickOnElement(_clickOnShoppingCartLink);















}
}
