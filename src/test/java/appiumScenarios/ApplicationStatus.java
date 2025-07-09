package appiumScenarios;

import org.testng.annotations.Test;
import generic.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ApplicationStatus {
    @Test
    public void applicationCurrentState() {
        AppiumDriver driver = Utility.createDriverSession();
        String appPackage = "io.appium.android.apis";

        System.out.println("Current state of the application is: " + ((AndroidDriver) driver).queryAppState(appPackage));
    }
}
