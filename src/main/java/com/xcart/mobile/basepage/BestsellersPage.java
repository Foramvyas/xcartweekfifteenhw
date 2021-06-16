package com.xcart.mobile.basepage;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

import java.util.List;

public class BestsellersPage extends Utility {




    By mouseHoverAndClickOnBestSellersLink = By.xpath("//li[@class='leaf has-sub']//li[2]/a[1]/span");
    By verifyTextBestSellers = By.xpath("//h1[@id='page-title']");
    By mouseHoverOnSortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By selectProductInDescendingOrder = By.partialLinkText("Name Z -");
    By verifyProductArrangeInDescendingOrder = By.xpath("//h5[@class='product-name']");
    By selectProductPriceInDescendingOrder = By.partialLinkText("Price High - L");
    By verifyProductArrangeInHighToLowOrder = By.xpath("//li[@class='product-price-base']/span");
    By selectRateOfProducts = By.partialLinkText("Rates");
    By verifyProductArrangeInRatesOrder = By.xpath("//div[@class='product-average-rating']");


// 1.2 Mouse hover on the “Bestsellers”  link and click

    public void setMouseHoverAndClickOnBestSellersLink() {
        Reporter.log("Mouse hover and click on bestsellers link " + mouseHoverAndClickOnBestSellersLink.toString() + "<br>");
        mouseHoverToElementAndClick(mouseHoverAndClickOnBestSellersLink);
    }

    // 1.3 Verify the text “Bestsellers”
    public String setVerifyTextBestSellers() {
        Reporter.log("Verify user successfully navigate to bestsellers Page " + verifyTextBestSellers.toString() + "<br>");
        return getTextFromElement(verifyTextBestSellers);
    }

    //1.4 Mouse hover on “Sort By” and select “Name Z-A”
    public void setMouseHoverOnSortBy() {
        Reporter.log("Mouse hover on sort by products" + mouseHoverOnSortBy.toString() + "<br>");
        mouseHover(mouseHoverOnSortBy);
    }

    public void clickOnProductArrangeInDescendingOrder(String value) {
        Reporter.log("select  Z to A selection to arrange product in descending order " + selectProductInDescendingOrder.toString() + "<br>");
        clickOnElement(selectProductInDescendingOrder);
    }
    //1.5 Verify that the product arrange by Z to A

    public List verifyProductArrangeInDescendingOrder() {
        Reporter.log("Verify displayed  product arrange in descending order " + verifyProductArrangeInDescendingOrder.toString() + "<br>");
        return getListfromElements(verifyProductArrangeInDescendingOrder);
    }
    //select “Price High-Low”

    public void selectPriceArrangeInHighToLowOrder(String price) {
        Reporter.log("Select High to low selection to arrange product price in descending order " + selectProductPriceInDescendingOrder.toString() + "<br>");
        clickOnElement(selectProductPriceInDescendingOrder);
    }

    public List verifyProductPriceArrangeInDescendingOrder() {
        Reporter.log("Verify displayed product price arrange in descending order " + verifyProductArrangeInHighToLowOrder.toString() + "<br>");
        return getListfromElements(verifyProductArrangeInHighToLowOrder);
    }

    public void clickOnSelectRateOfProducts(String rate) {
        Reporter.log("Click on rates of product from selection " + selectRateOfProducts.toString() + "<br>");
        clickOnElement(selectRateOfProducts);
    }

    public List verifyProductArrangeInRatesOrder() {
        Reporter.log("Verify displayed product arrange in rates order");
        return getListfromElements(verifyProductArrangeInRatesOrder);
    }

}
