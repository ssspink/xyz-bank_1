package com.nopcommerce.demo.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw5.cutomlisterners.CustomListeners;
import com.nopcommerce.demo.sw5.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class
CheckOutPage extends Utility {


    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressLine1;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipCode;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement telNumber;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayAirRadioBtn;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement shippingContinueBtn;

    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardOption;

    @CacheLookup
    @FindBy(xpath = "//button[@name='save' and @class='button-1 payment-method-next-step-button']")
    WebElement paymentContinueOption;

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement creditCardOption1;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cCode;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueCardPayment;

    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']//span[@class='value']")
    WebElement paymentMethod;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[@class='value']")
    WebElement shippingMethod;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong")
    WebElement total;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirm;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYou;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement orderMessage;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueClick;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeToStoreText;

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement radioBtn2ndDayAir;

    @CacheLookup
    @FindBy(xpath = "//button[@name='save' and @class='button-1 payment-method-next-step-button']")
    WebElement visaCard;


    public void inputFirstName(String fName) {
        Reporter.log("Input first name " + firstName.toString());
        sendTextToElement(firstName, fName);
        CustomListeners.test.log(Status.PASS, "Input First Name: " + fName);
    }

    public void inputLastName(String lName) {
        Reporter.log("Input last name " + lastName.toString());
        sendTextToElement(lastName, lName);
        CustomListeners.test.log(Status.PASS, "Input Last name: " + lName);
    }

    public void inputEmail(String email1) {
        Reporter.log("Input email " + email.toString());
        sendTextToElement(email, email1);
        CustomListeners.test.log(Status.PASS, "Input Email: " + email1);
    }

    public void selectCountry(String country1) {
        Reporter.log("Select Country " + country.toString());
        selectByVisibleTextFromDropDown(country, country1);
        CustomListeners.test.log(Status.PASS, "Select Country: " + country1);
    }

    public void inputCity(String city1) {
        Reporter.log("Select city1 " + city.toString());
        sendTextToElement(city, city1);
        CustomListeners.test.log(Status.PASS, "Input City: " + city1);
    }

    public void inputAddress(String address1) {
        Reporter.log("Input address1 " + lastName.toString());
        sendTextToElement(addressLine1, address1);
        CustomListeners.test.log(Status.PASS, "Input Address: " + address1);
    }

    public void inputZipCode(String zipCode1) {
        Reporter.log("Input zipcode " + zipCode.toString());
        sendTextToElement(zipCode, zipCode1);
        CustomListeners.test.log(Status.PASS, "Select Processor: " + zipCode1);
    }

    public void inputTelephoneNumber(String telNum) {
        Reporter.log("Input telnum " + telNumber.toString());
        sendTextToElement(telNumber, telNum);
        CustomListeners.test.log(Status.PASS, "Select Processor: " + telNum);
    }

    public void clickOnContinueBtn() {
        Reporter.log("Click ContinueBtn " + continueBtn.toString());
        clickOnElement(continueBtn);
        CustomListeners.test.log(Status.PASS, "Click on Continue button ");
    }

    public void clickOnNextDayAirRadioBtn() {
        Reporter.log("Click NextDayAirRadioBtn " + nextDayAirRadioBtn.toString());
        clickOnElement(nextDayAirRadioBtn);
        CustomListeners.test.log(Status.PASS, "Click Next Day Air Radio Button: ");
    }

    public void clickOnContinueOnShipping() {
        Reporter.log("Click continueOnShipping " + shippingContinueBtn.toString());
        clickOnElement(shippingContinueBtn);
        CustomListeners.test.log(Status.PASS, "Click continue button on Shipping ");
    }

    public void clickOnCreditCard() {
        Reporter.log("click creditCard " + creditCardOption.toString());
        clickOnElement(creditCardOption);
        CustomListeners.test.log(Status.PASS, "Click on Credit Card option: ");
    }

    public void clickOnPaymentContinue() {
        Reporter.log("click payment Continue Option " + paymentContinueOption.toString());
        clickOnElement(paymentContinueOption);
        CustomListeners.test.log(Status.PASS, "Click on Payment Continue button: ");
    }

    public void selectCreditCard(String creditCard1) throws InterruptedException {
        Reporter.log("select creditCard " + creditCardOption1.toString());
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(creditCardOption1, creditCard1);
        CustomListeners.test.log(Status.PASS, "Select Credit Card: " + creditCard1);
    }

    public void inputCardHolderName(String cName) {
        Reporter.log("Input cardHolderName " + cardHolderName.toString());
        sendTextToElement(cardHolderName, cName);
        CustomListeners.test.log(Status.PASS, "Input Card holder name: " + cName);
    }

    public void inputCardNumber(String cardNum) {
        Reporter.log("Input cardNumber " + cardNumber.toString());
        sendTextToElement(cardNumber, cardNum);
        CustomListeners.test.log(Status.PASS, "Input Card Number: " + cardNum);
    }

    public void selectExpireMonth(String expMonth) {
        Reporter.log("Select Card Expire Month: " + expireMonth.toString() + "<br>");
        selectByVisibleTextFromDropDown(expireMonth, expMonth);
        CustomListeners.test.log(Status.PASS, "Select Card expire month " + expMonth);
    }

    public void selectExpireYear(String expYear) {
        Reporter.log("Select Expire year: " + expireYear.toString() + "<br>");
        selectByVisibleTextFromDropDown(expireYear, expYear);
        CustomListeners.test.log(Status.PASS, "Select Expire year: " + expYear);
    }

    public void inputCardCode(String code) {
        Reporter.log("Enter Card Code: " + cCode.toString() + "<br>");
        sendTextToElement(cCode, code);
        CustomListeners.test.log(Status.PASS, "Enter Card Code: " + code);
    }

    public void clickOnContinuCardPayment() {
        Reporter.log("Click on Continue button: " + continueCardPayment.toString() + "<br>");
        clickOnElement(continueCardPayment);
        CustomListeners.test.log(Status.PASS, "Click on Continue button: ");
    }

    public void verifyPaymentMethod(String expectedMessage) {
        Reporter.log("Verify Payment Method " + paymentMethod.toString() + "<br>");
        verifyElements(paymentMethod, expectedMessage, "payment method not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Payment Method " + expectedMessage);
    }

    public void verifyShippingMethod(String expectedMessage) {
        Reporter.log("Verify Shipping Method: " + shippingMethod.toString() + "<br>");
        verifyElements(shippingMethod, expectedMessage, "shipping method is not correct");
        CustomListeners.test.log(Status.PASS, "Verify Shipping Method: " + expectedMessage);
    }

    public void verifyTotal(String expectedMessage) {
        Reporter.log("Verify Total: " + total.toString() + "<br>");
        verifyElements(total, expectedMessage, "Total is not correct");
        CustomListeners.test.log(Status.PASS, "Verify Total: " + expectedMessage);
    }

    public void clickOnConfirm() {
        Reporter.log("Click on Confirm Button: " + confirm.toString() + "<br>");
        clickOnElement(confirm);
        CustomListeners.test.log(Status.PASS, "Click on Confirm Button ");
    }

    public void verifyThankYou(String expectedMessage) {
        Reporter.log("Verify Thank You Message " + thankYou.toString() + "<br>");
        verifyElements(thankYou, expectedMessage, "Message not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Thank You Message: " + expectedMessage);
    }

    public void verifyOrderConfirmation(String expectedMessage) {
        Reporter.log("Verify Order Message " + orderMessage.toString() + "<br>");
        verifyElements(orderMessage, expectedMessage, "Order is confirm");
        CustomListeners.test.log(Status.PASS, "Verify Order Message: " + expectedMessage);
    }

    public void clickOnContinue() {
        Reporter.log("Click on Continue button " + continueClick.toString() + "<br>");
        clickOnElement(continueClick);
        CustomListeners.test.log(Status.PASS, "Click on Continue button ");
    }

    //    public void verifyTextWelcomeToOurStore(String expectedMessage){
//        verifyElements(Welcome to our store,);
    //   }
    public void clickOnRadioBtn2ndDayAir() {
        Reporter.log("Click on Radio button for 2nd Day Air: " + radioBtn2ndDayAir.toString() + "<br>");
        clickOnElement(radioBtn2ndDayAir);
        CustomListeners.test.log(Status.PASS, "Click on Radio button for 2nd Day Air: ");
    }

    public void inputVisaCardNumber(String vCardNumber) {
        Reporter.log("Select VISA Card: " + visaCard.toString() + "<br>");
        sendTextToElement(visaCard, vCardNumber);
        CustomListeners.test.log(Status.PASS, "Select VISA Card: " + vCardNumber);
    }

    public void verifyNokiaCartTotal(String expectedTotal) {
        Reporter.log("Verify Nokia Cart Total " + total.toString() + "<br>");
        verifyElements(total, expectedTotal, "Total not displayed as expected");
        CustomListeners.test.log(Status.PASS, "Verify Nokia Cart Total " + expectedTotal);
    }

}
