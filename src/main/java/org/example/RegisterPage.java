package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
    private By _firstname = By.id("FirstName");
    private By _lastname = By.id("LastName");
    private By _email = By.name("Email");
    private By _password = By.id("Password");
    private  By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");
    private By _loginButton = By.xpath("//button[text() ='Log in']");
    private By _monthOfBirth =By.name("DateOfBirthMonth");
    private By _yearOfBirth =By.name("DateOfBirthYear");
    private By _dateOfBirth = By.name("DateOfBirthDay");

    LoadProp loadProp = new LoadProp();
    public void enterRegistrationDetails_ForNewRegistration(){

        //enter first name
        typeText(_firstname,loadProp.getProperty("firstname"));

        //enter last name
        typeText(_lastname,loadProp.getProperty("lastname"));

        //select DOB from dropdown
        selectElementByValue(_dateOfBirth,loadProp.getProperty("date_Of_Birth"));

        //select month of year
        selectElementByValue(_monthOfBirth,loadProp.getProperty("month_Of_Birth"));

        //select year of birth
        selectElementByText(_yearOfBirth,loadProp.getProperty("year_Of_Birth"));

        //enter email id
        typeText(_email, loadProp.getProperty("email")+ timeStamp() + loadProp.getProperty("email_Domain"));

        //enter password
        typeText(_password, loadProp.getProperty("password"));

        //enter and confirm password
        typeText(_confirmPassword, loadProp.getProperty("confirm_Password"));

        //click on register button
        clickOnElement(_registerButton);

    }
    public void enterRegistrationDetails_ForAlreadyRegisteredUser(){
        //enter first name
        typeText(_firstname,loadProp.getProperty("firstname"));

        //enter last name
        typeText(_lastname, loadProp.getProperty("lastname"));

        //select dob from dropdown
        selectElementByValue(_dateOfBirth,loadProp.getProperty("date_Of_Birth"));

        //select month of birth from dropdown
        selectElementByValue(_monthOfBirth,loadProp.getProperty("month_Of_Birth"));

        //select year of month from drop down
        selectElementByText(_yearOfBirth,loadProp.getProperty("year_Of_Birth"));


        //enter email idemail_Domain"
        typeText(_email,loadProp.getProperty("email") +loadProp.getProperty("email_Domain"));

        //enter password
        typeText(_password,loadProp.getProperty("password"));

        //enter and confirm password
        typeText(_confirmPassword,loadProp.getProperty("confirm_Password"));

        //click on register button
        clickOnElement(_registerButton);

    }
}
