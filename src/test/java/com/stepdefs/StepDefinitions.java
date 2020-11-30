package com.stepdefs;

import com.pages.BasePage;
import com.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.Base64;

public class StepDefinitions {
    BasePage theBasePage;
    HomePage theHomePage;

    @Given("user is on home page")
    public void getHomePage(){

        theHomePage= new HomePage();

    }
    @Then("user should see the chat symbol at left bottom corner of the home page")
    public void checkChatSymbol(){

          theHomePage.checkChatSymbol();
          //theBasePage.closePage();
    }
    @When("user clicks on the chat symbol")
    public void clickChatSymbol(){
         theHomePage.clickChatSymbol();
    }
    @Then("user should see the chat box popup")
    public void seeChatBoxPopUp(){
        theHomePage.seeChatBoxPopUp();
    }
}
