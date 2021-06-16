package com.xcart.mobile.basepage;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {


    By shippingLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[3]");

    By newLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[4]");

    By comingSoonLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[5]");

    By contactUsLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[6]");

    public void clickOnShippingLink() {
        Reporter.log("Click on shipping link " + shippingLink.toString() + "<br>");
        clickOnElement(shippingLink);
    }

    public void clickOnNewLink() {
        Reporter.log("Click on new link " + newLink.toString() + "<br>");
        clickOnElement(newLink);
    }

    public void clickOnComingSoonLink() {
        Reporter.log("Click on coming soon link " + comingSoonLink.toString() + "<br>");
        clickOnElement(comingSoonLink);
    }

    public void clickOnContactUsLink() {
        Reporter.log("Click on contact us link " + contactUsLink.toString() + "<br>");
        clickOnElement(contactUsLink);
    }

}