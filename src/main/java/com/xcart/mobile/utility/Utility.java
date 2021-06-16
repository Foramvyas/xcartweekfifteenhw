package com.xcart.mobile.utility;

import com.xcart.mobile.basepage.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Utility extends BasePage {

    public void clickOnElement(By by) {

        driver.findElement(by).click();
    }

    public String getTextFromElement(WebElement element) {
        //String text=driver.findElement(by).getText();// another way to write next line
        return element.getText();
    }

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }

    public void sendTextToElement(By by, String text) {

        driver.findElement(by).sendKeys(text);

    }


    public void sendTextToElement(WebElement element, String text) {

        element.sendKeys();
    }

    public void selectByValueFromDropDown(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public <value> void selectByValueFromDropDown(By by, String value) {

        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public void selectByVisibleTextFromDropDown(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void selectByVisibleTextFromDropDown(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);
    }


    public void selectByIndexFromDropDown(WebElement element, int value) {
        Select select = new Select(element);
        select.selectByIndex(value);
    }

    public void selectByIndexFromDropDown(By by, int value) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(value);

    }

    public void mouseHover(WebElement element) {
        Actions actions = new Actions(driver);
        WebElement target = element;
        actions.moveToElement(target).build().perform();
    }

    public void mouseHover(By by) {
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(by);
        actions.moveToElement(target).build().perform();
    }

    public void clear(WebElement element) {
        element.clear();
    }

    public void clear(By by) {
        driver.findElement(by).clear();

    }

    public Random randomGenerator = new Random();
    public int randomInt = randomGenerator.nextInt(1000);


    public WebElement waitUntilvisibilityofElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;

    }

    public <BY, attribute> String getAttributeFromElement(By by, String value) {
        return driver.findElement(by).getAttribute("value");

    }

    public List getListfromElements(By by) {
        return driver.findElements(by);

    }

    public List getListfromWebelements(By by) {

        return driver.findElements(by);
    }

    public static String currentTimeStamp() {
        Date d= new Date();
        return d.toString().replace(":", "_").replace(" ", "_");
    }


    public static String takeScreenShot(String fileName) {
        String filePath = System.getProperty("user.dir") + "/test-output/html/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        String imageName = fileName + currentTimeStamp() + ".jpg";
        String destination = filePath + imageName;
        try {
            FileUtils.copyFile(scr1, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();
    }
}



