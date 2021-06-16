package com.xcart.mobile.basepage;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class TopMenuPage extends Utility {


    By verifyTextShipping = By.xpath("//h1[@id='page-title']");
    By verifyNewArrivalsText = By.xpath("//h1[@id='page-title']");
    By verifyComingSoonText = By.xpath("//h1[@id='page-title']");
    By verifyContactUsText = By.xpath("//h1[@id='page-title']");


    public String verifyShippingPageNavigation() {
        Reporter.log("Verify user navigate to shipping page successfully" + verifyTextShipping.toString() + "<br>");
        return getTextFromElement(verifyTextShipping);
    }

    public String verifySNewLinkPageNavigation() {
        Reporter.log("Verify user navigate to new page successfully" + verifyNewArrivalsText.toString() + "<br>");
        return getTextFromElement(verifyNewArrivalsText);
    }

    public String verifyComingSoonPageNavigation() {
        Reporter.log("Verify user navigate to coming soon page successfully" + verifyComingSoonText.toString() + "<br>");
        return getTextFromElement(verifyComingSoonText);

    }

    public String verifyContactUsPageNavigation() {
        Reporter.log("Verify user navigate to contact us page successfully" + verifyContactUsText.toString() + "<br>");
        return getTextFromElement(verifyContactUsText);


    }


}
