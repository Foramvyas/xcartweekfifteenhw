package com.xcart.mobile.basepage;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ClearShoppingCart extends Utility {


    By mouseHoverOnProduct = By.cssSelector(" .product.productid-13");
    By addToCartButton = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']/span[1]");
    By verifyMessageProductAdded = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By clickOnCloseMessageSign = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1]");
    By yourCartIcon = By.xpath("//div[@title='Your cart']");
    By viewCartButton = By.xpath("//span[contains(text(),'View cart')]");
    By verifyShoppingCart = By.xpath("//h1[@id='page-title']");
    By emptyCart = By.xpath("//a[contains(text(),'Empty your cart')]");
    By verifyMessageProductDeleted = By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
    By verifyCartEmptyText = By.xpath("//h1[normalize-space()='Your cart is empty']");
    By arrangeProduct = By.partialLinkText("Name A -");


    public void mouseHoverOnAddToCartButton() {
        Reporter.log("Mouse hover on product Vinyl Idolz: Ghostbusters" + mouseHoverOnProduct.toString() + "<br>");
        mouseHover(addToCartButton);
    }

    public void clickOnAddToCartButton() {
        Reporter.log("Click on add to cart button" + addToCartButton.toString() + "<br>");
        clickOnElement(addToCartButton);
    }

    public String verifyTextProductAddedToCart() {
        Reporter.log("Verify the the text product added" + verifyMessageProductAdded.toString() + "<br>");
        return getTextFromElement(verifyMessageProductAdded);
    }

    public void clickOnCloseSign() {
        Reporter.log("Click on close sign" + clickOnCloseMessageSign.toString() + "<br>");
        clickOnElement(clickOnCloseMessageSign);
    }

    public void clickOnYourCartIcon() {
        Reporter.log("Click on your cart icon" + yourCartIcon.toString() + "<br>");
        clickOnElement(yourCartIcon);
    }

    public void clickOnViewCartButton() {
        Reporter.log("Click on view cart button " + viewCartButton.toString() + "<br>");
        clickOnElement(viewCartButton);
    }

    public String verifyShoppingCartText() {
        Reporter.log("Verify shopping cart text" + verifyShoppingCart.toString() + "<br>");
        return getTextFromElement(verifyShoppingCart);
    }

    public void clickOnEmptyCartLink() {
        Reporter.log("Click on empty cart link" + emptyCart.toString() + "<br>");
        clickOnElement(emptyCart);
    }

    //1.11 Verify the text “Are you sure you want to clear your cart?” on alert
    public String verifyYouWantToClearYourCartText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void clickOnAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public String verifyItemDeletedMessage() {
        Reporter.log("Verify item deleted from shopping cart" + verifyMessageProductDeleted.toString() + "<br>");
        return getTextFromElement(verifyMessageProductDeleted);
    }

    public String verifyYourCartIsEmptyMessage() {
        Reporter.log("Verify item added to shopping cart" + verifyCartEmptyText.toString() + "<br>");
        return getTextFromElement(verifyCartEmptyText);
    }

    public void arrangeProductAlphabetically() {
        Reporter.log("Arrange product alphabetically" + arrangeProduct.toString() + "<br>");
        clickOnElement(arrangeProduct);
    }

}
