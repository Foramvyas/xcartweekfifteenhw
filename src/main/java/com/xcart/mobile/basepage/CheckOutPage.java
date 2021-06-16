package com.xcart.mobile.basepage;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class CheckOutPage extends Utility {

    By verifyTextLogInToAccount = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By emailField = By.xpath("//input[@id='email']");
    By continueButton = By.xpath("//tbody/tr[2]/td[1]/button[1]");
    By verifyTextSecureCheckOut = By.xpath("//h1[@class='title']");
    By firstName = By.xpath("//input[@id='shippingaddress-firstname']");
    By lastName = By.xpath("//input[@id='shippingaddress-lastname']");
    By enterAddress = By.xpath("//input[@id='shippingaddress-street']");
    By clearCityField = By.xpath("//input[@id='shippingaddress-city']");
    By enterShippingCity = By.xpath("//input[@id='shippingaddress-city']");
    By countryCode = By.xpath("//select[@id='shippingaddress-country-code']");
    By customState = By.xpath("//input[@id='shippingaddress-custom-state']");
    By clearZipCodeField = By.xpath("//input[@id='shippingaddress-zipcode']");
    By enterZipCode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By checkBox = By.xpath("//input[@id='create_profile']");
    By passWord = By.xpath("//input[@id='password']");
    By deliveryMethod = By.xpath("//input[@id='method128' and @name='methodId']");
    By paymentMethod = By.xpath("//input[@id='pmethod6' and @name='methodId']");
    By verifyTotal = By.xpath("//div[@class='total clearfix']//span[@class='surcharge-cell']");
    By placeOrderButton = By.xpath("//div[@class='button-row']");
    By verifyThankYouMessage = By.xpath("//h1[@id='page-title']");

    public String verifyTheTextLoginInToYourAccount() {
        Reporter.log("Verify that the text log in to your account " + verifyTextLogInToAccount.toString() + "<br>");
        return getTextFromElement(verifyTextLogInToAccount);
    }

    public void enterEmailId(String email) {
        Reporter.log("Enter Email" + email + "to email field" + emailField.toString() + "<br>");
        sendTextToElement(emailField, email);
    }

    public void clickOnContinueButton() {
        Reporter.log("Click on continue button " + continueButton.toString() + "<br>");
        clickOnElement(continueButton);
    }

    public String verifySecureCheackOutText() {
        Reporter.log(" Verify the text secure checkout " + verifyTextSecureCheckOut.toString() + "<br>");
        return getTextFromElement(verifyTextSecureCheckOut);
    }

    public void enterFirstName(String firstname) {
        Reporter.log("Enter Firstname" + firstname + "to first name field" + firstName.toString() + "<br>");
        sendTextToElement(firstName, firstname);
    }

    public void enterLastName(String lastname) {
        Reporter.log("Enter Lastname" + lastname + "to last name field" + lastName.toString() + "<br>");
        sendTextToElement(lastName, lastname);
    }

    public void enterAddress(String address) {
        Reporter.log("Enter address" + address + "to last name field" + enterAddress.toString() + "<br>");
        sendTextToElement(enterAddress, address);
    }

    public void cleatShippingCityField() {
        Reporter.log("Clear the text form city field" + clearCityField.toString() + "<br>");
        clear(clearCityField);
    }

    public void enterCityName(String city) {
        Reporter.log("Enter city" + city + "city field" + enterShippingCity.toString() + "<br>");
        sendTextToElement(enterShippingCity, city);
    }

    public void enetrCountryCode(int countrycode) {
        Reporter.log("Select country code form drop down" + countryCode.toString() + "<br>");
        selectByIndexFromDropDown(countryCode, countrycode);
    }

    public void enetrCustomState(String state) {
        Reporter.log("Enter the custom state" + state + "state field" + customState.toString() + "<br>");
        sendTextToElement(customState, state);
    }

    public void setClearzipCodeFieldField() {
        Reporter.log("Clear the zip code field" + clearZipCodeField.toString() + "<br>");
        clear(clearZipCodeField);
    }

    public void enterZipcode(String zipcode) {
        Reporter.log("Enter the zip code " + zipcode + "zipcode field" + enterZipCode.toString() + "<br>");
        sendTextToElement(enterZipCode, zipcode);
    }

    //eneter email
    public void clickOnCheckBoxToCreateAccountForLaterUse() {
        Reporter.log("Click on checkbox to create account for use" + checkBox.toString() + "<br>");
        clickOnElement(checkBox);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password" + password + "password field" + passWord.toString() + "<br>");
        sendTextToElement(passWord, password);
    }

    public void selectLocalShippingMethod(String deliverymethod) {
        Reporter.log("Select delivery method " + deliveryMethod.toString() + "<br>");
        clickOnElement(deliveryMethod);
    }

    public void selectPaymentMethod(String payamentmethod) {
        Reporter.log("Select payment method " + paymentMethod.toString() + "<br>");
        clickOnElement(paymentMethod);
    }

    public String verifyTotalPrice() {
        Reporter.log("Verify the total price" + verifyTotal.toString() + "<br>");
        return getTextFromElement(verifyTotal);
    }

    public void clickOnPlaceOrderButton() {
        Reporter.log("Click on place order button" + placeOrderButton.toString() + "<br>");
        clickOnElement(placeOrderButton);
    }

    public String verifyThankYouMessage() {
        Reporter.log("Verify user successfully place the order" + verifyThankYouMessage.toString() + "<br>");
        return getTextFromElement(verifyThankYouMessage);
    }


}
