package modules;

import org.openqa.selenium.WebDriver;
import pageobjects.AutomationHomePage;

/**
 * Created by tommy.wang on 3/31/2015.
 */
public class SignOutAction {
    public static void Execute(WebDriver webDriver){
        AutomationHomePage.sign_out.click();
    }
}
