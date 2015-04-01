package pageobjects;

import org.openqa.selenium.WebDriver;

/**
 * Created by tommy.wang on 3/31/2015.
 */
public abstract class  BaseClass {
    public static WebDriver webDriver;
    public static boolean bResult;

    public BaseClass(WebDriver webDriver){
        BaseClass.webDriver = webDriver;
        BaseClass.bResult = true;
    }
}
