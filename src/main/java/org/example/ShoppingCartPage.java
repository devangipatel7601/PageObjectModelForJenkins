package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{

    private By _productname1 = By.className("product-name");
    LoadProp loadProp = new LoadProp();
    public void compareProductNameInCart() {


        //verify & print out leica camera name text
        String productname1 = getTextFromElement(_productname1);

        System.out.println("Product in cart: "+ productname1);

        //confirm product name is same in shopping cart as what we add
        Assert.assertEquals(productname1,loadProp.getProperty("leica_Product_Name"));


    }
}
