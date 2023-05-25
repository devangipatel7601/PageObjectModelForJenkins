package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.example.BasePage.driver;
import static org.example.Utils.clickOnElement;
import static org.example.Utils.getTextFromElement;

public class HomePage extends Utils{

    private By _registerButton = By.className("ico-register");
    private By _goodRadioButton = By.id("pollanswers-2");
    private By _voteButton = By.xpath("//button[text()='Vote']");
    private By _clickOnElectronics = By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[2]/a[@href='/electronics']");
    private By _login = By.xpath("//a[contains(@class,'ico-login')]");
    private By _verifyVoteMessageForRegUser = By.xpath("//span[@class='poll-total-votes']");
    LoadProp loadProp= new LoadProp();
    public void clickOnRegisterButton() {
        //click on register button
        clickOnElement(_registerButton);
    }
    public void clickOnGoodRadioButton() {
        //click on good radio button
        clickOnElement(_goodRadioButton);
    }

    public void clickOnVoteButton() {
        //click on vote button
        clickOnElement(_voteButton);
    }
    public void clickOnLogin() {
        //click on login
        clickOnElement(_login);

    }
    public void clickOnElectronics() {
        clickOnElement(_clickOnElectronics);
    }
    public void verifyRegisteredUserShouldBeAbleToVoteSuccessfully() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class=\"poll-results\"]/li[1]")));

        String actualmessage = getTextFromElement(_verifyVoteMessageForRegUser);

        System.out.println("message: " + actualmessage);
        Assert.assertEquals(actualmessage, loadProp.getProperty("vote_msg"));

    }
}
