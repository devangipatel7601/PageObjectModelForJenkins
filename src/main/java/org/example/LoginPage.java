package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{
    private By _email = By.xpath("//input[contains(@class,'email')]");
    private By _password = By.xpath("//input[contains(@class,'password')]");
    private By _loginButton = By.xpath("//button[text()='Log in']");

    LoadProp loadProp = new LoadProp();
    public void fillInLoginDetails(){

        //type email
        typeText(_email,loadProp.getProperty("email")+loadProp.getProperty("email_Domain"));

        //type password
        typeText(_password,loadProp.getProperty("password"));

        //click on login button
        clickOnElement(_loginButton);
    }
}
