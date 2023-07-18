package com.nopcommerce.demo.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw5.cutomlisterners.CustomListeners;
import com.nopcommerce.demo.sw5.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//li//a")
    WebElement topMenu;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Computers')]")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Electronics')]")
    WebElement electronicsText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Apparel')]")
    WebElement apparelText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Digital downloads')]")
    WebElement digitalDownloadsText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Books')]")
    WebElement booksText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Jewelry')]")
    WebElement jewelryText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Gift Cards')]")
    WebElement giftCardsText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;


    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//li//a"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }

        }
    }

    public void verifyComputersPageNavigation(String expectedMessage) {
        Reporter.log("Verify Computer Text: " + computerText.toString() + "<br>");
        verifyElements(computerText, expectedMessage, "Wrong Text");
        CustomListeners.test.log(Status.PASS, "Verify Computer Text: " + expectedMessage);
    }

    public void verifyElectronicsPageNavigation(String expectedMessage) {
        Reporter.log("Verify Electronic Text: " + electronicsText.toString() + "<br>");
        verifyElements(electronicsText, expectedMessage, "Wrong Text");
        CustomListeners.test.log(Status.PASS, "Verify Electronic Text: " + expectedMessage);
    }

    public void verifyApparelPageNavigation(String expectedMessage) {
        Reporter.log("Verify Apparel Text: " + apparelText.toString() + "<br>");
        verifyElements(apparelText, expectedMessage, "Wrong Text");
        CustomListeners.test.log(Status.PASS, "Verify Apparel Text: " + expectedMessage);
    }

    public void verifyDigitalDownloadsPageNavigation(String expectedMessage) {
        Reporter.log("Verify Digital Download Text: " + digitalDownloadsText.toString() + "<br>");
        verifyElements(digitalDownloadsText, expectedMessage, "Wrong Text");
        CustomListeners.test.log(Status.PASS, "Verify Digital Download Text: " + expectedMessage);
    }

    public void verifyBooksPageNavigation(String expectedMessage) {
        Reporter.log("Verify Books Text: " + booksText.toString() + "<br>");
        verifyElements(booksText, expectedMessage, "Wrong Text");
        CustomListeners.test.log(Status.PASS, "Verify Books Text: " + expectedMessage);
    }

    public void verifyJewelryPageNavigation(String expectedMessage) {
        Reporter.log("Verify Jewelry Text: " + jewelryText.toString() + "<br>");
        verifyElements(jewelryText, expectedMessage, "Wrong Text");
        CustomListeners.test.log(Status.PASS, "Verify Jewelry Text: " + expectedMessage);
    }

    public void verifyGiftCardsPageNavigation(String expectedMessage) {
        Reporter.log("Verify Gift Card Text: " + giftCardsText.toString() + "<br>");
        verifyElements(giftCardsText, expectedMessage, "Wrong Text");
        CustomListeners.test.log(Status.PASS, "Verify Gift Card Text:: " + expectedMessage);
    }

    public void verifyTheTextWelcomeToOurStore(String expectedMessage) {
        Reporter.log("Verify Welcome Text " + welcomeText.toString() + "<br>");
        verifyElements(welcomeText, expectedMessage, "Message is not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Welcome Text: " + expectedMessage);
    }


    //**************** Electronics Test****************************

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronics;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhones;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    public void mouseHoverOnElectronics() {
        Reporter.log("Clicking on Login Link " + electronics.toString());
        mouseHoverToElement(electronics);
        CustomListeners.test.log(Status.PASS, "Mouse hover on Electronics ");
    }

    public void mouseHoverAndClickOnCellPhones() {
        Reporter.log("Mouse hover and click on Cell Phones " + cellPhones.toString() + "<br>");
        mouseHoverToElementAndClick(cellPhones);
        CustomListeners.test.log(Status.PASS, "Mouse hover and click on Cell Phones ");
    }

    public void clickOnLogoutLink() {
        Reporter.log("Click on Logout Link " + logout.toString() + "<br>");
        clickOnElement(logout);
        CustomListeners.test.log(Status.PASS, "Click on Logout Link ");
    }

    public void getURL() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("The URL is incorrect", url, "https://demo.nopcommerce.com/");
        CustomListeners.test.log(Status.PASS, "Get URL ");
    }
}
