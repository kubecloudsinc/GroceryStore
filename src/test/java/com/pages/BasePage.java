package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class BasePage {
    private static final Logger LOG = Logger.getLogger(BasePage.class);
    public String GECODRIVER_PROPERTY= "webdriver.gecko.driver";
    public String GECODRIVER_LOCATION= "C:\\Users\\Haripemireddy\\QATraining\\Gecko\\geckodriver.exe";
    public String LOGIN_URL= "https://www.zeggys.com/";
    FluentWait<WebDriver> wait;
    WebDriver theWebDriver;
    WebElement theWebElement;

    public WebElement neverStaleFrame(WebElement frameElement) {
        try {
            LOG.debug("entered into the try block");
            return theWebDriver.findElement(By.id(frameElement.getAttribute("id")));
        }catch (StaleElementReferenceException e){
            theWebDriver.switchTo().defaultContent();
           return neverStaleFrame(frameElement);
        }


    }
    public void closePage(){
        theWebDriver.close();
    }
}
