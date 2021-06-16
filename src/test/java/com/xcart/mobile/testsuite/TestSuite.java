package com.xcart.mobile.testsuite;

import com.xcart.mobile.basepage.*;
import com.xcart.mobile.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends TestBase {

    TopMenuPage topMenuPage = new TopMenuPage();
    HomePage homePage = new HomePage();
    HotDealsPage hotDealsPage = new HotDealsPage();
    BestsellersPage bestsellersPage = new BestsellersPage();
    AvengersProductPage avengersProductPage = new AvengersProductPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    ClearShoppingCart clearShoppingCart = new ClearShoppingCart();

    @Test(groups = {"smoke","sanity","regression"})
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {

        homePage.clickOnShippingLink();
        Thread.sleep(3000);
        String expectedPagetext = "Shipping";
        String actualPagetext = topMenuPage.verifyShippingPageNavigation();
        Assert.assertEquals(actualPagetext, expectedPagetext);
    }

    @Test(groups ={"sanity","regression"} )
    public void verifyUserShouldNavigateToNewPageSuccessfully() throws InterruptedException {

        homePage.clickOnNewLink();
        Thread.sleep(1000);
        String expectedPageText = "New arrivals";
        String actualPageText = topMenuPage.verifySNewLinkPageNavigation();
        Assert.assertEquals(actualPageText, expectedPageText);
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully() throws InterruptedException {

        homePage.clickOnComingSoonLink();
        Thread.sleep(1000);
        String expectedPageText = "Coming soon";
        String actualPageText = topMenuPage.verifyComingSoonPageNavigation();
        Assert.assertEquals(actualPageText, expectedPageText);
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() throws InterruptedException {

        homePage.clickOnContactUsLink();
        Thread.sleep(100);
        String expectedMessage = "Contact us";
        String actualMessage = topMenuPage.verifyContactUsPageNavigation();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(groups = {"smoke","sanity","regression"})
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {

        hotDealsPage.mouseHoverOnHotDealsLink();
        hotDealsPage.mouseHoverOnSaleLink();

        String expectedText = "Sale";
        String actualText=hotDealsPage.verifySalePageNavigation();
        Assert.assertEquals(actualText,expectedText);

        hotDealsPage.setMouseHoverOnSortByPosition();
        Thread.sleep(1000);
        hotDealsPage.clickOnAlphabeticalOrder("Name A-Z");
        Thread.sleep(1000);
        List<WebElement> products;
        products = hotDealsPage.getListOfProducts();
        List<String> productsList = new ArrayList<>();
        for (WebElement productName : products) {
            productsList.add(productName.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productsList);
        Collections.sort(tempList);
        System.out.println(productsList);
        System.out.println(tempList);
        Assert.assertEquals(productsList, tempList);
    }
    @Test(groups ={"sanity","regression"} )
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDealsLink();
        hotDealsPage.mouseHoverOnSaleLink();

        String expectedText = "Sale";
        String actualText=hotDealsPage.verifySalePageNavigation();
        Assert.assertEquals(actualText,expectedText);
        hotDealsPage.setMouseHoverOnSortByPosition();
        hotDealsPage.clickOnPriceLowToHigh("Price Low-High");
        Thread.sleep(1000);
        List<WebElement> products;
        products = hotDealsPage.getPriceOfProducts();
        List<String> productsList = new ArrayList<>();
        for (WebElement productName : products) {
            productsList.add(productName.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productsList);

        Collections.sort(tempList);
        System.out.println(productsList);
        System.out.println(tempList);
        Assert.assertEquals(productsList, tempList);
    }

    @Test(groups = "regression")
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDealsLink();
        hotDealsPage.mouseHoverOnSaleLink();

        String expectedText = "Sale";
        String actualText=hotDealsPage.verifySalePageNavigation();
        Assert.assertEquals(actualText,expectedText);
        hotDealsPage.setMouseHoverOnSortByPosition();
        hotDealsPage.clickOnRates("Rates");
        Thread.sleep(1000);
        List<WebElement> products;
        products = hotDealsPage.getRatesOfProducts();
        List<String> productsList = new ArrayList<>();
        for (WebElement productName : products) {
            productsList.add(productName.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productsList);

        Collections.sort(tempList);
        System.out.println(productsList);
        System.out.println(tempList);
        Assert.assertEquals(productsList, tempList);
    }

    @Test(groups = "regression")
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDealsLink();
        bestsellersPage.setMouseHoverAndClickOnBestSellersLink();
        Thread.sleep(1000);
        String expectedText = "Bestsellers";
        String actualText = bestsellersPage.setVerifyTextBestSellers();
        Assert.assertEquals(actualText, expectedText);
        bestsellersPage.setMouseHoverOnSortBy();
        bestsellersPage.clickOnProductArrangeInDescendingOrder("Name Z-A");
        Thread.sleep(2000);
        List<WebElement> products;
        products = bestsellersPage.verifyProductArrangeInDescendingOrder();
        List<String> productsList = new ArrayList<>();
        for (WebElement productName : products) {
            productsList.add(productName.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productsList);
        Thread.sleep(2000);
        Collections.sort(tempList, Collections.reverseOrder());
        System.out.println(productsList);
        System.out.println(tempList);
        Assert.assertEquals(productsList, tempList);
    }
    @Test(groups = "regression")
    //This test is fail as not arranging in descending order
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDealsLink();
        bestsellersPage.setMouseHoverAndClickOnBestSellersLink();
        Thread.sleep(1000);
        String expectedText = "Bestsellers";
        String actualText = bestsellersPage.setVerifyTextBestSellers();
        Assert.assertEquals(actualText, expectedText);
        bestsellersPage.setMouseHoverOnSortBy();
        bestsellersPage.selectPriceArrangeInHighToLowOrder("Price High-Low");
        Thread.sleep(2000);
        List<WebElement> products;
        products = bestsellersPage.verifyProductPriceArrangeInDescendingOrder();
        List<String> productsList = new ArrayList<>();
        for (WebElement productName : products) {
            productsList.add(productName.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productsList);
        Thread.sleep(4000);
        Collections.sort(tempList,Collections.reverseOrder());
        System.out.println(productsList);
        System.out.println(tempList);
        Assert.assertEquals(tempList, productsList);
    }
    @Test(groups = "regression")

    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDealsLink();
        bestsellersPage.setMouseHoverAndClickOnBestSellersLink();
        Thread.sleep(1000);
        String expectedText = "Bestsellers";
        String actualText = bestsellersPage.setVerifyTextBestSellers();
        Assert.assertEquals(actualText, expectedText);
        bestsellersPage.setMouseHoverOnSortBy();
        bestsellersPage.clickOnSelectRateOfProducts("Rates");
        Thread.sleep(1000);
        List<WebElement> products;
        products = bestsellersPage.verifyProductArrangeInRatesOrder();
        List<String> productsList = new ArrayList<>();
        for (WebElement productName : products) {
            productsList.add(productName.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productsList);

        Collections.sort(tempList, Collections.<String>reverseOrder());
        System.out.println(productsList);
        System.out.println(tempList);
        Assert.assertEquals(productsList, tempList);
    }
    @Test(groups = {"smoke","sanity","regression"})
    public void verifyThatUserShouldPlaceOrderSuccessfullyForAvengersFabrikationsPlush() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDealsLink();
        hotDealsPage.mouseHoverOnSaleLink();
        Thread.sleep(1000);
        String expectedText = "Sale";
        String actualText = hotDealsPage.verifySalePageNavigation();
        Assert.assertEquals(actualText, expectedText);
        hotDealsPage.setMouseHoverOnSortByPosition();
        hotDealsPage.clickOnAlphabeticalOrder("Name A-Z");
        avengersProductPage.mouseHoverOnProductAvengers();
        Thread.sleep(1000);
        avengersProductPage.clickOnAddToCartProductAvengers();
        Thread.sleep(1000);
        String expectedTextMessage = "Product has been added to your cart";
        String actualTextMessage = avengersProductPage.verifyProductAddedInToCartMessage();
        Assert.assertEquals(actualTextMessage, expectedTextMessage);
        Thread.sleep(1000);
        avengersProductPage.clickOnSignToCloseMessage();
        avengersProductPage.clickOnYourCartIcon();
        avengersProductPage.setClickOnViewCartButton();
        Thread.sleep(1000);
        String expectedCartMessage = "Your shopping cart - 1 item";
        String actualCartMessage = avengersProductPage.verifyOneProductAddedToCart();
        Assert.assertEquals(actualCartMessage, expectedCartMessage);
        avengersProductPage.clearTheQuantity();
        avengersProductPage.changeTheQuantity();
        Thread.sleep(1000);
        String expectedUpdatedCartMessage = "Your shopping cart - 2 items";
        String actualUpdatedCartMessage = avengersProductPage.verifyCartUpdatedWithTwoProduct();
        Assert.assertEquals(actualUpdatedCartMessage, expectedUpdatedCartMessage);
        Thread.sleep(1000);
        String expectedTotal = "$29.98";
        String actualTotal = avengersProductPage.verifyTheItemTotal();
        Assert.assertEquals(actualTotal, expectedTotal);
        Thread.sleep(1000);
        String expectedSubTotal = "$36.00";
        String actualSubTotal = avengersProductPage.verifySubTotalOfProducts();
        Assert.assertEquals(actualSubTotal, expectedSubTotal);
        Thread.sleep(1000);
        avengersProductPage.clickOnCheckOutButton();
        String expectedloginMessage = "Log in to your account";
        String actualLoginMessage = checkOutPage.verifyTheTextLoginInToYourAccount();
        Assert.assertEquals(actualLoginMessage, expectedloginMessage);
        Thread.sleep(1000);
        checkOutPage.enterEmailId("samira.patel" + randomInt + "@yahoo.com");
        checkOutPage.clickOnContinueButton();
        Thread.sleep(1000);
        String expectedCheckoutMessage = "Secure Checkout";
        String actualCheckoutMessage = checkOutPage.verifySecureCheackOutText();
        Assert.assertEquals(actualCheckoutMessage, expectedCheckoutMessage);
        Thread.sleep(1000);
        checkOutPage.enterFirstName("Samira");
        checkOutPage.enterLastName("Patel");
        checkOutPage.enterAddress("Flat 1,Kingsbuty road");
        Thread.sleep(1000);
        checkOutPage.cleatShippingCityField();
        checkOutPage.enterCityName("London");
        checkOutPage.enetrCountryCode(6);
        checkOutPage.enetrCustomState("Middlesex");
        Thread.sleep(1000);
        checkOutPage.setClearzipCodeFieldField();
        checkOutPage.enterZipcode("NW9 9HN");
        checkOutPage.clickOnCheckBoxToCreateAccountForLaterUse();
        checkOutPage.enterPassword("abcd1234");
        Thread.sleep(1000);
        checkOutPage.selectLocalShippingMethod("Local Shipping");
        checkOutPage.selectPaymentMethod("COD");
        Thread.sleep(1000);
        String expectedTotalVerification = "$37.03";
        String actualTotalVerification = checkOutPage.verifyTotalPrice();
        Assert.assertEquals(actualTotalVerification, expectedTotalVerification);
        Thread.sleep(1000);
        checkOutPage.clickOnPlaceOrderButton();
        String expectedVerification = "Thank you for your order";
        String actualVerification = checkOutPage.verifyThankYouMessage();
        Assert.assertEquals(actualVerification, expectedVerification);
    }
    @Test (groups ={"sanity","regression"} )
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDealsLink();
        bestsellersPage.setMouseHoverAndClickOnBestSellersLink();
        Thread.sleep(1000);
        String expectedText = "Bestsellers";
        String actualText = bestsellersPage.setVerifyTextBestSellers();
        Assert.assertEquals(actualText, expectedText);
        Thread.sleep(1000);
        bestsellersPage.setMouseHoverOnSortBy();
        clearShoppingCart.arrangeProductAlphabetically();
        Thread.sleep(1000);
        clearShoppingCart.mouseHoverOnAddToCartButton();
        clearShoppingCart.clickOnAddToCartButton();
        Thread.sleep(1000);
        String expectedTextMessage = "Product has been added to your cart";
        String actualTextMessage = clearShoppingCart.verifyTextProductAddedToCart();
        Assert.assertEquals(actualTextMessage, expectedTextMessage);
        clearShoppingCart.clickOnCloseSign();
        clearShoppingCart.clickOnYourCartIcon();
        clearShoppingCart.clickOnViewCartButton();
        Thread.sleep(1000);
        String expectedCartMessage2 = "Your shopping cart - 1 item";
        String actualCartMessage2 = clearShoppingCart.verifyShoppingCartText();
        Assert.assertEquals(actualCartMessage2,expectedCartMessage2);
        Thread.sleep(1000);
        clearShoppingCart.clickOnEmptyCartLink();
        clearShoppingCart.verifyYouWantToClearYourCartText();
        clearShoppingCart.clickOnAlert();
        Thread.sleep(1000);
        String expectedCartEmptyMessage = "Item(s) deleted from your cart";
        String actualCartEmptyMessage = clearShoppingCart.verifyItemDeletedMessage();
        Assert.assertEquals(actualCartEmptyMessage,expectedCartEmptyMessage);
        String expectedMessageEmptyCart = "Your cart is empty";
        String actualMessageEmptyCart = clearShoppingCart.verifyYourCartIsEmptyMessage();
        Assert.assertEquals(actualMessageEmptyCart,expectedMessageEmptyCart);

    }
}