package com.nopcommerce.demo.sw5.testsuite;

import com.nopcommerce.demo.sw5.cutomlisterners.CustomListeners;
import com.nopcommerce.demo.sw5.pages.*;
import com.nopcommerce.demo.sw5.testbase.BaseTest;
import com.nopcommerce.demo.sw5.testdata.TestData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ComputersTest extends BaseTest {
    HomePage homePage;
    ComputersPage computersPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    ShoppingCartPage shoppingCartPage;
    SignInPage signInPage;
    CheckOutPage checkoutPage;


    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void inIt() {
        homePage = new HomePage();
        computersPage = new ComputersPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        shoppingCartPage = new ShoppingCartPage();
        signInPage = new SignInPage();
        checkoutPage = new CheckOutPage();
    }

    @Test(groups = {"sanity"})
    public void verifyProductArrangeInAlphaBaticalOrder() {
        // 1.1 Click on Computer Menu.
        homePage.selectMenu("Computers");
        //  1.2 Click on Desktop
        computersPage.clickOnDesktop();
        // 1.3 Select Sort By position "Name: Z to A"
        desktopsPage.selectZToAFromSortByDropdown("Name: Z to A");
        // 1.4 Verify the Product will arrange in Descending order.
        desktopsPage.verifyProductAreInDescendingOrder();
    }

    @Test (groups = {"smoke", "regression"}, dataProvider = "Register details", dataProviderClass = TestData.class)
    public void verifyProductAddedToShoppingCartSuccessFully(String fname, String laname, String country1,
                                                             String city1, String address1, String zipCode1, String telNum) throws InterruptedException {
        //2.1 Click on Computer Menu.
        homePage.selectMenu("Computers");
        //  1.2 Click on Desktop
        computersPage.clickOnDesktop();
        // 1.3 Select Sort By position "Name: A to Z"
        desktopsPage.selectZToAFromSortByDropdown("Name: A to Z");
        // 2.4 Click on "Add To Cart"
        desktopsPage.clickOnAddToCart();
        // 2.5 Verify the Text "Build your own computer"
        buildYourOwnComputerPage.verifyBuildYourOwnComputerText("Build your own computer");
        // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputerPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        // 2.7.Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputerPage.selectRAM("8GB [+$60.00]");
        // 2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputerPage.selectHDD("400 GB [+$100.00]");
        // 2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputerPage.selectOS("Vista Premium [+$60.00]");
        // 2.10 Click Check boxes "Total Commander [+$5.00]"
        buildYourOwnComputerPage.selectSoftware("Total Commander [+$5.00]");
        // 2.11 Verify the price "$1,475.00" (Price is dynamic)
        //buildYourOwnComputerPage.verifyPrice("$1,475.00");
        // 2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputerPage.clickOnAddToCart();
        // 2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        buildYourOwnComputerPage.verifyAddToCartMessage("The product has been added to your shopping cart");
        // After that close the bar clicking on the cross button.
        buildYourOwnComputerPage.clickOnCrossButton();
        // 2.14 Then MouseHover on "Shopping cart"
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        // Click on "GO TO CART" button.
        buildYourOwnComputerPage.clickOnGoToCart();
        // 2.15 Verify the message "Shopping cart"
        shoppingCartPage.verifyShoppingCartTitle("Shopping cart");
        // 2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeQuantityAndUpdateCart("2");
        // 2.17 Verify the Total"$2,950.00"
        shoppingCartPage.verifyTotal("$2,950.00");
        //2.18 click on checkbox “I agree with the terms of service
        shoppingCartPage.clickOnTermsOfServiceCheckbox();
        // 2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutBtn();
        // 2.20 Verify the Text “Welcome, Please Sign In!”
        signInPage.verifyWelcomeText("Welcome, Please Sign In!");
        // 2.21 Click on “CHECKOUT AS GUEST” Tab
        signInPage.clickOnCheckoutAsGuestBtn();
        // Fill all the Mandetory Field
        // Input First Name
        checkoutPage.inputFirstName(fname);
        // Input Last Name
        checkoutPage.inputLastName(laname);
        // Input Email
        checkoutPage.inputEmail(getRandomEmail());
        // Select Country
        checkoutPage.selectCountry(country1);
        // Input City
        checkoutPage.inputCity(city1);
        // Input Address
        checkoutPage.inputAddress(address1);
        // Input ZipCode
        checkoutPage.inputZipCode(zipCode1);
        // Input Telephone
        checkoutPage.inputTelephoneNumber(telNum);
        // 2.23 Click on “CONTINUE”
        checkoutPage.clickOnContinueBtn();
        // 2.24 Click on Radio Button “Next Day Air($0.00)”
        checkoutPage.clickOnNextDayAirRadioBtn();
        // 2.25 Click on “ Shipping CONTINUE”
        checkoutPage.clickOnContinueOnShipping();
        // 2.26 Select Radio Button “Credit Card”
        checkoutPage.clickOnCreditCard();
        // 2.27 Select “Master card” From Select credit card dropdown
        checkoutPage.clickOnPaymentContinue();
        // Select Master card
        checkoutPage.selectCreditCard("Visa");
        // Input Cardholder Name
        checkoutPage.inputCardHolderName("Harry VD");
        // Input Card Number
        checkoutPage.inputCardNumber("5556654813485409");
        // Select Expire Month
        checkoutPage.selectExpireMonth("09");
        // Select Expire year
        checkoutPage.selectExpireYear("2027");
        // Input card code
        checkoutPage.inputCardCode("911");
        // 2.29 Click on “CONTINUE”
        checkoutPage.clickOnContinuCardPayment();
        // 2.30 Verify “Payment Method” is “Credit Card”
        checkoutPage.verifyPaymentMethod("Credit Card");
        // 2.32 Verify “Shipping Method” is “Next Day Air”
        checkoutPage.verifyShippingMethod("Next Day Air");
        // 2.33 Verify Total is “$2,950.00”
        checkoutPage.verifyTotal("$2,950.00");
        // 2.34 Click on “CONFIRM”
        checkoutPage.clickOnConfirm();
        // 2.35 Verify the Text “Thank You”
        checkoutPage.verifyThankYou("Thank you");
        // 2.36 Verify the message “Your order has been successfully processed!”
        checkoutPage.verifyOrderConfirmation("Your order has been successfully processed!");
        // 2.37 Click on “CONTINUE”
        checkoutPage.clickOnContinue();
        // 2.37 Verify the text “Welcome to our store”
        homePage.verifyTheTextWelcomeToOurStore("Welcome to our store");
    }
}
