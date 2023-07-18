package com.nopcommerce.demo.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw5.cutomlisterners.CustomListeners;
import com.nopcommerce.demo.sw5.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumiaPage extends Utility {

    @CacheLookup
    @FindBy(css = "div[class='product-name'] h1")
    WebElement nokiaLumia1020;

    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement price;

    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantity;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement cartBtn;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement shoppingCartMessage;

    @CacheLookup
    @FindBy(css = "span[title='Close']")
    WebElement greenBtnClick;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping cart']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement goToCart;

    public void verifyTextNokiaLumia1020(String expText) {
        Reporter.log("Verify Text " + nokiaLumia1020.toString() + "<br>");
        verifyElements(nokiaLumia1020, expText, "Text not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Text: " + expText);
    }

    public void verifyThePrice(String expectedPrice) {
        Reporter.log("Verify Price " + price.toString() + "<br>");
        verifyElements(price, expectedPrice, "Price not displayed as expected");
        CustomListeners.test.log(Status.PASS, "Verify Price: " + expectedPrice);
    }

    public void changeQuantity(String qty) {
        Reporter.log("Change Quantity: " + quantity.toString() + "<br>");
        sendTextToElement(quantity, Keys.BACK_SPACE + qty);
        CustomListeners.test.log(Status.PASS, "Change Quantity: " + qty);
    }

    public void clickOnCartBtn() {
        Reporter.log("Click on Cart button " + cartBtn.toString() + "<br>");
        clickOnElement(cartBtn);
        CustomListeners.test.log(Status.PASS, "Click on Cart Button ");
    }

    public void verifyShoppingCartMessage(String expectedMessage) {
        Reporter.log("Verify Shopping Cart Message " + shoppingCartMessage.toString() + "<br>");
        verifyElements(shoppingCartMessage, expectedMessage, "Message is not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Shopping Cart Message: " + expectedMessage);
    }

    public void clickOnGreenBtn() {
        Reporter.log("Click on Green button: " + greenBtnClick.toString() + "<br>");
        clickOnElement(greenBtnClick);
        CustomListeners.test.log(Status.PASS, "Click on Green button ");
    }

    public void mouseHoverOnShoppingCart() {
        Reporter.log("Mouse hover on shopping Cart: " + shoppingCart.toString() + "<br>");
        mouseHoverToElement(shoppingCart);
        CustomListeners.test.log(Status.PASS, "Mouse hover on shopping Cart ");
    }

    public void clickOnGoToCart() {
        Reporter.log("Click on Go To Cart button " + goToCart.toString() + "<br>");
        clickOnElement(goToCart);
        CustomListeners.test.log(Status.PASS, "Click on Go To Cart button ");
    }

}
