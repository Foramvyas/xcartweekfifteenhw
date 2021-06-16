package com.xcart.mobile.basepage;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

import java.util.List;

public class HotDealsPage extends Utility {


    By mouseHoverHotDeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By mouseHoverAndClickOnSaleLink = By.xpath("//li[@class='leaf has-sub']//li[1]//a[1]");
    By verifyTheTextSale = By.xpath("//h1[@id='page-title']");
    By mouseHoverOnSortByPosition = By.xpath("//span[contains(text(),'Recommended')]");
    By clickOntAlphabeticalOrder = By.partialLinkText("Name A -");
    By verifyProductsArrangeAlphabetically = By.xpath("//h5[@class='product-name']/a[1]");
    By clickOnPriceArrangeLowToHigh = By.partialLinkText("Price Low - Hi");
    By verifyProductsPriceArrangeLowToHigh = By.xpath("//div[@class='product-price widget-fingerprint-product-price']/ul");
    By clickOnProductRates = By.partialLinkText("Rates");
    By verifyProductArrangeRates = By.xpath("//div[@class='stars-row full']");


    // 1.1 Mouse hover on the “Hot deals” link
    public void mouseHoverOnHotDealsLink() {
        Reporter.log("Mouse hover on hot deals link " + mouseHoverHotDeals.toString() + "<br>");
        mouseHover(mouseHoverHotDeals);
    }
    //  //1.2 Mouse hover on the “Sale”  link and click

    public void mouseHoverOnSaleLink() {
        Reporter.log("Mouse hover on sale link " + mouseHoverAndClickOnSaleLink.toString() + "<br>");
        mouseHoverToElementAndClick(mouseHoverAndClickOnSaleLink);
    }

    //1.3 Verify the text “Sale”
    public String verifySalePageNavigation() {
        Reporter.log("Verify user navigate to sale page " + verifyTheTextSale.toString() + "<br>");
        return getTextFromElement(verifyTheTextSale);
    }
    //1.4 Mouse hover on “Sort By” and select “Name A-Z”

    public void setMouseHoverOnSortByPosition() {
        Reporter.log("Mouse hover on sort by " + mouseHoverOnSortByPosition.toString() + "<br>");
        mouseHover(mouseHoverOnSortByPosition);
    }

    public void clickOnAlphabeticalOrder(String name) {
        Reporter.log("Click on Alphabetical Order " + clickOntAlphabeticalOrder.toString() + "<br>");
        clickOnElement(clickOntAlphabeticalOrder);
    }
    //1.5 Verify that the product arrange alphabetically

    public List getListOfProducts() {
        Reporter.log("Get List of products to arranged in alphabetical order " + verifyProductsArrangeAlphabetically.toString() + "<br>");
        return getListfromElements(verifyProductsArrangeAlphabetically);
    }

    public void clickOnPriceLowToHigh(String price) {
        Reporter.log("Select the price Low to High order" + clickOnPriceArrangeLowToHigh.toString() + "<br>");
        clickOnElement(clickOnPriceArrangeLowToHigh);
    }

    public List getPriceOfProducts() {

        Reporter.log("Get list of products to arrange price Low to High" + verifyProductsPriceArrangeLowToHigh.toString() + "<br>");
        return getListfromWebelements(verifyProductsPriceArrangeLowToHigh);
    }

    public void clickOnRates(String rates) {
        Reporter.log("Click on product rate " + clickOnProductRates.toString() + "<br>");
        clickOnElement(clickOnProductRates);
    }

    public List getRatesOfProducts() {

        Reporter.log("Get list of products to arrange as rate order" + verifyProductArrangeRates.toString() + "<br>");
        return getListfromWebelements(verifyProductArrangeRates);
    }

}