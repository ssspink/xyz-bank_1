package com.nopcommerce.demo.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw5.cutomlisterners.CustomListeners;
import com.nopcommerce.demo.sw5.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Build your own computer']")
    WebElement buildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hdd;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement os;

    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement software;

    @CacheLookup
    @FindBy(id = "price-value-1")
    WebElement price;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement addToCartMsg;

    @CacheLookup
    @FindBy(xpath = ("//span[@title='Close']"))
    WebElement crossButton;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping cart']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement goToCart;

    public void verifyBuildYourOwnComputerText(String expectedMessage) {
        Reporter.log("Verify Build your own computer Text: " + buildYourOwnComputer.toString() + "<br>");
        verifyElements(buildYourOwnComputer, expectedMessage, "wrong text");
        CustomListeners.test.log(Status.PASS, "Verify Build your own Computer text " + expectedMessage);
    }

    // Selecting Processor
    public void selectProcessor(String processor1) {
        Reporter.log("Select processor : " + processor.toString() + "<br>");
        selectByVisibleTextFromDropDown(processor, processor1);
        CustomListeners.test.log(Status.PASS, "Select Processor: " + processor1);
    }

    // Selecting RAM
    public void selectRAM(String ram1) {
        Reporter.log("Select RAM: " + ram.toString() + "<br>");
        selectByVisibleTextFromDropDown(ram, ram1);
        CustomListeners.test.log(Status.PASS, "Select RAM: " + ram1);
    }

    // Selecting HDD
    public void selectHDD(String hdd1) {
        Reporter.log("Select HDD: " + hdd.toString() + "<br>");
        doClickOnElement(hdd, hdd1);
        CustomListeners.test.log(Status.PASS, "Select HDD: " + hdd1);
    }

    // Selecting Operating System
    public void selectOS(String os1) {
        Reporter.log("Select OS: " + os.toString() + "<br>");
        doClickOnElement(os, os1);
        CustomListeners.test.log(Status.PASS, "Select OS: " + os1);
    }

    // Selecting Software
    public void selectSoftware(String software1) {
        Reporter.log("Select Software: " + software.toString() + "<br>");
        doClickOnElement(software, software1);
        CustomListeners.test.log(Status.PASS, "Select Software: " + software1);
    }

    // Verifying Price
    public void verifyPrice(String expectedPrice) {
        Reporter.log("Verify Price: " + price.toString() + "<br>");
        verifyElements(price, expectedPrice, "error message not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Price: " + expectedPrice);
    }

    // Clicking on Add to Cart button
    public void clickOnAddToCart() {
        Reporter.log("Click on Add to Cart button: " + addToCart.toString() + "<br>");
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click on Add to Cart ");
    }

    // Verifying message that product added to cart
    public void verifyAddToCartMessage(String expectedMessage) {
        Reporter.log("Verify Add to Cart message: " + addToCartMsg.toString() + "<br>");
        verifyElements(addToCartMsg, expectedMessage, "error message is not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Add to Cart message: " + expectedMessage);
    }

    // Clicking on Cross button
    public void clickOnCrossButton() {
        Reporter.log("Click on Cross button: " + crossButton.toString() + "<br>");
        clickOnElement(crossButton);
        CustomListeners.test.log(Status.PASS, "Click on Cross button ");
    }

    // Mouse hover on Shopping Cart
    public void mouseHoverOnShoppingCart() {
        Reporter.log("Mouse hover on Shopping Cart: " + shoppingCart.toString() + "<br>");
        mouseHoverToElementAndClick(shoppingCart);
        CustomListeners.test.log(Status.PASS, "Mouse hover on shopping cart ");
    }

    // Clicking on Go To Cart
    public void clickOnGoToCart() {
        Reporter.log("Click on Go To Cart: " + goToCart.toString() + "<br>");
        clickOnElement(goToCart);
        CustomListeners.test.log(Status.PASS, "Click on Go To Cart ");
    }

}
