package com.hello;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.SignInAction;
import modules.SignOutAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.AutomationHomePage;
import pageobjects.LoginPage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by tommy.wang on 3/31/2015.
 */
public class ShoppingCart {
    public WebDriver driver;
    public static List<HashMap<String, String>> datamap = null;

    public ShoppingCart(){
        driver = Hooks.driver;
        datamap = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> sampleData = new HashMap<String, String>();
        sampleData.put("username", "abc@xyz.com");
        sampleData.put("password", "Test@123");

        datamap.add(sampleData);

    }

    @Given("^I open browser$")
    public void I_open_browser() throws Throwable {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @When("^I open automationpractice website$")
    public void i_open_automationpractice_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://automationpractice.com");
    }

    @And("^I sign in$")
    public void I_sign_in() throws Throwable {
        // Express the Regexp above with the code you wish you had
        PageFactory.initElements(driver, AutomationHomePage.class);
        PageFactory.initElements(driver, LoginPage.class);

        SignInAction.Execute(driver, datamap.get(0));
    }

    @Then("^I sign out$")
    public void I_sign_out() throws Throwable {
        // Express the Regexp above with the code you wish you had
        String url = driver.getCurrentUrl();
        String source = driver.getPageSource();
        String title = driver.getTitle();
        SignOutAction.Execute(driver);
    }

}
