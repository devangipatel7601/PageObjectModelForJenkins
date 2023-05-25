package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
    //create object by access modifiers
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    LeicaTMirrorlessDigitalCameraPage leicaTMirrorlessDigitalCameraPage = new
            LeicaTMirrorlessDigitalCameraPage();
    ShoppingCartPage shoppingcartPage = new ShoppingCartPage();
    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();

        //enter registration details to fill form
        registerPage.enterRegistrationDetails_ForNewRegistration();

        //verify user registered successfully or not
        registerResultPage.verifyUserRegisteredSuccessfully();


    }
  //  @Test
    public void VerifyRegisteredUserShouldBeAbleToVoteSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();

        //enter register details
        registerPage.enterRegistrationDetails_ForAlreadyRegisteredUser();

        //click on login
        homePage.clickOnLogin();

        //enter login detais
        loginPage.fillInLoginDetails();

        //click on good radio button
        homePage.clickOnGoodRadioButton();

        //click on vote button
        homePage.clickOnVoteButton();

        // verify message
        homePage.verifyRegisteredUserShouldBeAbleToVoteSuccessfully();


    }
    @Test
    public void verifyUserShouldBeAbleToSeeProductsInShoppingCartSuccessfully(){

        //click on Electronics
        homePage.clickOnElectronics();

        //click on camera & photo image
        electronicsPage.clickOnCameraAndPhoto();

        //click on Leica camera
        cameraAndPhotoPage.clickOnLeicaCamera();

        //get leica camera text
        leicaTMirrorlessDigitalCameraPage.leicaCameraAddToCartAndShoppingCart();

        // to compare product name matched or not in shopping cart
        shoppingcartPage.compareProductNameInCart();




    }
}
