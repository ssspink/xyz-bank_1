package com.nopcommerce.demo.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw5.cutomlisterners.CustomListeners;
import com.nopcommerce.demo.sw5.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortByDropdown;

    @CacheLookup
    @FindBy(css = "div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(1)")
    WebElement addToCart;

    public void selectZToAFromSortByDropdown(String filter) {
        Reporter.log("Select Z To A filter : " + sortByDropdown.toString() + "<br>");
        selectByVisibleTextFromDropDown(sortByDropdown, filter);
        CustomListeners.test.log(Status.PASS, "Select Z To A: " + filter);
    }

    public void clickOnAddToCart() throws InterruptedException {
        Reporter.log("Click on Add To Cart: ");
        Thread.sleep(1000);
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click on Add to Cart button ");
    }

    //************************* Sort Products by Name Z To A ***************************//
    By productList = By.cssSelector(".product-thumb h4 a");

    public void verifyProductAreInDescendingOrder() {
//        Thread.sleep(2000);
        List<WebElement> originalList = driver.findElements(productList);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }

        originalProductNameList.sort(String.CASE_INSENSITIVE_ORDER.reversed());
        System.out.println(originalProductNameList);

        List<WebElement> afterSortingList = driver.findElements(productList);
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product1 : afterSortingList) {
            afterSortingProductName.add(product1.getText());
        }
        System.out.println(afterSortingProductName);
        Assert.assertEquals(originalProductNameList, afterSortingProductName, "Product not sorted");

        CustomListeners.test.log(Status.PASS, "Verify Products are sorted in Descending Order ");
    }


}
