package com.nopcommerce.demo.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw5.cutomlisterners.CustomListeners;
import com.nopcommerce.demo.sw5.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup

    @FindBy(id = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registerMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    public void verifyTextRegister(String expectedText) {
        Reporter.log("Verify Register text " + registerText.toString() + "<br>");
        verifyElements(registerText, expectedText, "Text is not Displayed");
        CustomListeners.test.log(Status.PASS, "Verify Register Text: " + expectedText);
    }

    public void inputFirstNameField(String name) {
        Reporter.log("Input First Name: " + firstName.toString() + "<br>");
        sendTextToElement(firstName, name);
        CustomListeners.test.log(Status.PASS, "Input First Name: " + name);
    }

    public void lastNameField(String lName) {
        Reporter.log("Input Last Name: " + lastName.toString() + "<br>");
        sendTextToElement(lastName, lName);
        CustomListeners.test.log(Status.PASS, "Input Last Name: " + lName);
    }

    public void emailField(String email1) {
        Reporter.log("Input Email: " + email.toString() + "<br>");
        sendTextToElement(email, email1);
        CustomListeners.test.log(Status.PASS, "Input Email: " + email1);
    }

    public void passwordField(String password1) {
        Reporter.log("Input Password: " + password.toString() + "<br>");
        sendTextToElement(password, password1);
        CustomListeners.test.log(Status.PASS, "Input Password: " + password1);
    }

    public void confirmPasswordField(String confirmPass) {
        Reporter.log("Input confirm password: " + confirmPassword.toString() + "<br>");
        sendTextToElement(confirmPassword, confirmPass);
        CustomListeners.test.log(Status.PASS, "Input Confirm Password: " + confirmPass);
    }

    public void clickOnRegister() {
        Reporter.log("Click on Register button " + register.toString() + "<br>");
        clickOnElement(register);
        CustomListeners.test.log(Status.PASS, "Click on Register button ");
    }

    public void verifyRegisterTextMessage(String expextedMessage) {
        Reporter.log("Verify Register Text Message " + registerMessage.toString() + "<br>");
        verifyElements(registerMessage, expextedMessage, "Message is not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Register Text Message: " + expextedMessage);
    }

    public void clickOnContinueBtn() {
        Reporter.log("Click on Continue button " + continueBtn.toString() + "<br>");
        clickOnElement(continueBtn);
        CustomListeners.test.log(Status.PASS, "Click on Continue button ");
    }


}
