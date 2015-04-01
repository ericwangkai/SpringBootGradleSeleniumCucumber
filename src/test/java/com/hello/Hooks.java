package com.hello;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;

/**
 * Created by tommy.wang on 3/31/2015.
 */

public class Hooks
{
    public static WebDriver driver;
    @Before
/**
 * Delete all cookies at the start of each scenario to avoid
 * shared state between tests
 */
    public void openBrowser() throws MalformedURLException {
        System.out.println("Called openBrowser");
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
    }
    @After
/**
 * Embed a screenshot in test report if test is marked as failed
 */
    public void embedScreenshot(Scenario scenario) {
        if(scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }
            catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
        driver.quit();
    }
}
