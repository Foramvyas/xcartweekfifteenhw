package com.xcart.mobile.basepage;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AvengersProductPage extends Utility {


    By mouseHoverOnProductAvengers = By.xpath("//a[@class='product-thumbnail next-previous-assigned']");
    By clickOnAddToCartProductButton = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-16']/span[1]");
    By verifyProductAddedToCartMessage = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By clickOnSignToCloseMessage = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1]");
    By clickOnYourCartIcon = By.xpath("//div[@title='Your cart']");
    By clickOnViewCartButton = By.xpath("//span[contains(text(),'View cart')]");
    By verifyTheTextOneItemAddedToCart = By.xpath("//h1[@id='page-title']");
    By clearTheQuantity = By.xpath("//input[@id='amount16' and @name='amount']");
    By changeTheQuantity = By.xpath("//input[@id='amount16' and @name='amount']");
    By verifyCartUpdatedWithTwoItem = By.xpath("//h1[normalize-space()='Your shopping cart - 2 items']");
    By verifyTheProductTotal = By.xpath("//ul[@class='sums']//span[@class='surcharge-cell']");
    By verifyTheSubTotal = By.xpath("//li[@class='total']//span[@class='surcharge-cell']");
    By checkOutButton = By.xpath("//span[contains(text(),'Go to checkout')]");


    public void mouseHoverOnProductAvengers() {
        Reporter.log("Mouse hover on product image " + mouseHoverOnProductAvengers.toString() + "<br>");
        mouseHover(mouseHoverOnProductAvengers);
    }

    // 1.5 Click on “Add to cart” button of the product “Avengers Fabrikations Plush”
    public void clickOnAddToCartProductAvengers() {
        Reporter.log("Click on add to cart product button " + clickOnAddToCartProductButton.toString() + "<br>");
        clickOnElement(clickOnAddToCartProductButton);
    }

    // 1.6 Verify the message “Product has been added to your cart” display in  green bar
    public String verifyProductAddedInToCartMessage() {
        Reporter.log("Verify Product added to cart message" + verifyProductAddedToCartMessage.toString() + "<br>");
        return getTextFromElement(verifyProductAddedToCartMessage);
    }

    // 1.7 Click on X sign to close the message
    public void clickOnSignToCloseMessage() {
        Reporter.log("Click on sign to close the message " + clickOnSignToCloseMessage.toString() + "<br>");
        clickOnElement(clickOnSignToCloseMessage);
    }

    //  1.8 Click on “Your cart” icon and Click on “View cart” button
    public void clickOnYourCartIcon() {
        Reporter.log("Click on your cart icon " + clickOnYourCartIcon.toString() + "<br>");
        clickOnElement(clickOnYourCartIcon);
    }

    public void setClickOnViewCartButton() {
        Reporter.log("Click on view cart button " + clickOnViewCartButton.toString() + "<br>");
        clickOnElement(clickOnViewCartButton);
    }

    // 1.9 Verify the text “Your shopping cart - 1 item”
    public String verifyOneProductAddedToCart() {
        Reporter.log("Verify shopping cart had one item addded text " + verifyTheTextOneItemAddedToCart.toString() + "<br>");
        return getTextFromElement(verifyTheTextOneItemAddedToCart);
    }

    // 1.10 Change the Qty = 2
    public void clearTheQuantity() {
        Reporter.log("Clear the quantity " + clearTheQuantity.toString() + "<br>");
        clear(changeTheQuantity);
    }

    public void changeTheQuantity() {
        Reporter.log("Change the quantity" + changeTheQuantity.toString() + "<br>");
        sendTextToElement(changeTheQuantity, "2");
    }

    //1.11 Verify the text “Your shopping cart - 2 items
    public String verifyCartUpdatedWithTwoProduct() {
        Reporter.log("Verify the cart updated with two item" + verifyCartUpdatedWithTwoItem.toString() + "<br>");
        return getTextFromElement(verifyCartUpdatedWithTwoItem);
    }

    //1.12 Verify the Subtotal $29.98
    public String verifyTheItemTotal() {
        Reporter.log("Verify the product total" + changeTheQuantity.toString() + "<br>");
        return getTextFromElement(verifyTheProductTotal);
    }

    //1.13 Verify the total $36.00
    public String verifySubTotalOfProducts() {
        Reporter.log("Verify the subtotal of products added to cart" + verifyTheSubTotal.toString() + "<br>");
        return getTextFromElement(verifyTheSubTotal);
    }

    //1.14 Click on “Go to checkout” button
    public void clickOnCheckOutButton() {
        Reporter.log("Click on checkout button" + checkOutButton.toString() + "<br>");
        clickOnElement(checkOutButton);
    }

}
