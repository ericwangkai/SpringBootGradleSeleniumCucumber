package modules;

import org.openqa.selenium.WebDriver;
import pageobjects.AutomationHomePage;
import pageobjects.LoginPage;

import java.util.HashMap;

/**
 * Created by tommy.wang on 3/31/2015.
 */
public class SignInAction {

    public static void Execute(WebDriver webDriver, HashMap<String, String> map){
        AutomationHomePage.sign_in.click();
        LoginPage.email.sendKeys(map.get("username"));
        LoginPage.password.sendKeys(map.get("password"));
        LoginPage.signin_button.click();
    }
}
