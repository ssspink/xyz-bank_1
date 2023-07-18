package com.nopcommerce.demo.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw5.cutomlisterners.CustomListeners;
import com.nopcommerce.demo.sw5.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonesPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Cell phones']")
    WebElement cellphones;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView;

    @CacheLookup
    @FindBy(css = "div:nth-of-type(3) > .product-item h2 > a")
    WebElement productNokiaLumia1020;

    public void verifyTextCellPhone(String expText) {
        Reporter.log("Verify Cell phone text: " + cellphones.toString() + "<br>");
        verifyElements(cellphones, expText, "Error text not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Cell phone text: " + expText);
    }

    public void clickOnListTab() {
        Reporter.log("Click on List View tab: " + listView.toString() + "<br>");
        clickOnElement(listView);
        CustomListeners.test.log(Status.PASS, "Click on List View tab  ");
    }

    public void clickOnNokiaLumia1020() {
        Reporter.log("Click on Nokia Lumia 1020: " + productNokiaLumia1020.toString() + "<br>");
        clickOnElement(productNokiaLumia1020);
        CustomListeners.test.log(Status.PASS, "Click on Nokia Lumia 1020 ");
    }
}
