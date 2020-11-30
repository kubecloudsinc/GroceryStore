package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage{

    private static final Logger LOG = Logger.getLogger(HomePage.class);

   // private By
    private By xpathBy = By.xpath("//button[@id='formSubmit']");
    private By greetingXathby= By.xpath("//p[@id='greetingsText']");
    private By chatBoxBy= By.xpath("//span[@id='maximizeChat']");
    //private By findXpathBy=By.xpath("//body/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]");
   // private By idBy= By.id("tawkchat-status-text-container");
   // private By classnameBy=By.className("appear");

    public HomePage(){
        System.setProperty(GECODRIVER_PROPERTY,GECODRIVER_LOCATION);
        theWebDriver = new FirefoxDriver();
        theWebDriver.manage().window().maximize();
        theWebDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        wait = new FluentWait<>(theWebDriver);
//        wait.until(ExpectedConditions.presenceOfElementLocated(findXpathBy));
        theWebDriver.get(LOGIN_URL);
    }

//    public void checkChatSymbol(){
//        try {
//
//            LOG.debug("web element is :" + theWebElement.getAttribute("id"));
//           theWebDriver.findElement(By.id(theWebElement.getAttribute("id")));
//        }catch (StaleElementReferenceException exp) {
//            theWebDriver.switchTo().defaultContent();
//            checkChatSymbol();
//        }
//
//    }
//
//    public void clickChatSymbol(){
//
//        theWebDriver.findElement(chatBoxBy).click();
//
//    }
//
//    public void seeChatBoxPopUp(){
//        wait=new FluentWait<>(theWebDriver);
//        wait.until(ExpectedConditions.presenceOfElementLocated(xpathBy));
//        theWebElement= theWebDriver.findElement(greetingXathby);
//    }
}
