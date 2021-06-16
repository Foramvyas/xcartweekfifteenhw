package com.xcart.mobile.testNG;

import org.testng.annotations.Test;

public class TestNGGrouping {
    @Test(groups = {"smoke", "sanity", "regression"})
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToNewPageSuccessfully() throws InterruptedException {

    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully() throws InterruptedException {

    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() throws InterruptedException {

    }

    @Test(groups = {"smoke", "sanity", "regression"})
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {

    }

    @Test(groups = {"sanity", "regression"})
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {

    }

    @Test(groups = "regression")
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
    }

    @Test(groups = "regression")
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {

    }

    @Test(groups = "regression")
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        System.out.println("Fail method for screenshot");

    }

    @Test(groups = "regression")
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {

    }

    @Test(groups = {"smoke", "sanity", "regression"})
    public void verifyThatUserShouldPlaceOrderSuccessfullyForAvengersFabrikationsPlush() throws InterruptedException {

    }

    @Test(groups = {"sanity", "regression"})
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {

    }


}
