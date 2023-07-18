package com.nopcommerce.demo.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw5.cutomlisterners.CustomListeners;
import com.nopcommerce.demo.sw5.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantity;

    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCartBtn;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong")
    WebElement total;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsOfService;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[5]/input[1]")
    WebElement quantityNokia;


    // Verifying Shopping cart title
    public void verifyShoppingCartTitle(String expectedMessage) {
        Reporter.log("Verify Shopping Cart Title " + shoppingCartText.toString() + "<br>");
        verifyElements(shoppingCartText, expectedMessage, "Title is not display as expected ");
        CustomListeners.test.log(Status.PASS, "Verify Shopping Cart Title: " + expectedMessage);
    }

    // Change quality and click update cart button
    public void changeQuantityAndUpdateCart(String qty) {
        Reporter.log("Change quantity: " + quantity.toString() + "<br>");
        sendTextToElement(quantity, Keys.BACK_SPACE + qty);
        CustomListeners.test.log(Status.PASS, "Change Quantity: " + qty);
        clickOnElement(updateCartBtn);
        CustomListeners.test.log(Status.PASS, "Click on Update Cart button ");
    }

    // Verifying total
    public void verifyTotal(String expectedTotal) {
        Reporter.log("Verify total: " + total.toString() + "<br>");
        verifyElements(total, expectedTotal, "Total is not correct");
        CustomListeners.test.log(Status.PASS, "Verify Total: " + expectedTotal);
    }

    // Clicking on Terms Of Service chekbox
    public void clickOnTermsOfServiceCheckbox() {
        Reporter.log("Click on Terms of Service checkbox " + termsOfService.toString() + "<br>");
        clickOnElement(termsOfService);
        CustomListeners.test.log(Status.PASS, "Click on Terms of Service checkbox ");
    }

    // Clicking on Checkout button
    public void clickOnCheckOutBtn() {
        Reporter.log("Click on Checkout button " + checkoutBtn.toString() + "<br>");
        clickOnElement(checkoutBtn);
        CustomListeners.test.log(Status.PASS, "Click on Checkout button ");
    }

    public void verifyQuantityForNokia(String expectedQuantity) {
        Reporter.log("Verify Quantity " + quantityNokia.toString() + "<br>");
        verifyElements(quantityNokia, expectedQuantity, "Quantity is not displayed as expected");
        CustomListeners.test.log(Status.PASS, "Verify Quantity: " + expectedQuantity);
    }

    public void verifyTheQuantity() {
        Reporter.log("Verify Quantity " + quantityNokia.toString() + "<br>");
        String expectedMessage = "2";
        String actualMessage = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).getAttribute("value");
        Assert.assertEquals("2", expectedMessage, actualMessage);
        CustomListeners.test.log(Status.PASS, "Verify Quantity ");
    }


}
