package com.nopcommerce.demo.sw5.testsuite;

import com.nopcommerce.demo.sw5.cutomlisterners.CustomListeners;
import com.nopcommerce.demo.sw5.pages.*;
import com.nopcommerce.demo.sw5.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ElectronicsTest extends BaseTest {

    HomePage homePage;
    CellPhonesPage cellPhonesPage;
    NokiaLumiaPage nokiaLumiaPage;
    ShoppingCartPage shoppingCartPage;
    SignInPage signInPage;
    RegisterPage registerPage;
    CheckOutPage checkoutPage;


    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void inIt() {
        homePage = new HomePage();
        cellPhonesPage = new CellPhonesPage();
        nokiaLumiaPage = new NokiaLumiaPage();
        shoppingCartPage = new ShoppingCartPage();
        signInPage = new SignInPage();
        registerPage = new RegisterPage();
        checkoutPage = new CheckOutPage();
    }

    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToCellPhonePageSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnElectronics();
        homePage.mouseHoverAndClickOnCellPhones();
        cellPhonesPage.verifyTextCellPhone("Cell phones");
        cellPhonesPage.clickOnListTab();
        Thread.sleep(1000);
        cellPhonesPage.clickOnNokiaLumia1020();
        nokiaLumiaPage.verifyTextNokiaLumia1020("Nokia Lumia 1020");
        nokiaLumiaPage.verifyThePrice("$349.00");
        nokiaLumiaPage.changeQuantity("2");
        nokiaLumiaPage.clickOnCartBtn();
        // 2.10 Verify the Message "The product has been added to your shopping cart" on Top green bar
        nokiaLumiaPage.verifyShoppingCartMessage("The product has been added to your shopping cart");
        // Click On Green button click
        nokiaLumiaPage.clickOnGreenBtn();
        // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumiaPage.mouseHoverOnShoppingCart();
        // Click on Go to Cart
        nokiaLumiaPage.clickOnGoToCart();
        // 2.12 Verify the message "Shopping cart"
        shoppingCartPage.verifyShoppingCartTitle("Shopping cart");
        // 2.13 Verify the quantity is 2
        shoppingCartPage.verifyTheQuantity();
        // 2.14 Verify the Total $698.00
        shoppingCartPage.verifyTotal("$698.00");
        // 2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsOfServiceCheckbox();
        // 2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutBtn();
        // 2.17 Verify the Text “Welcome, Please Sign In!”
        signInPage.verifyWelcomeText("Welcome, Please Sign In!");
        // 2.18 Click on “REGISTER” tab
        signInPage.clickOnRegisterBtn();
        // 2.19 Verify the text “Register”
        registerPage.verifyTextRegister("Register");
        // Input First Name
        registerPage.inputFirstNameField("Henry");
        // Input Last Name
        registerPage.lastNameField("smith");
        // Input Email
        registerPage.emailField(getRandomEmail());
        // Input Password
        registerPage.passwordField("password123");
        // Input Confirm Password
        registerPage.confirmPasswordField("password123");
        // 2.21 Click on “REGISTER” Button
        registerPage.clickOnRegister();
        // 2.22 Verify the message “Your registration completed”
        registerPage.verifyRegisterTextMessage("Your registration completed");
        // 2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinueBtn();
    }
}