package appiumScenarios;

import org.testng.annotations.Test;
import generic.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class UninstallAppTest {
    @Test
    public void uninstallApp() throws InterruptedException {
        AppiumDriver driver = Utility.createDriverSession();
        String appPackage = "io.appium.android.apis";

        System.out.println("Current state: " + ((AndroidDriver) driver).queryAppState(appPackage));

        // Uninstall app
        ((AndroidDriver) driver).removeApp(appPackage);

        System.out.println("After uninstall, app state: " + ((AndroidDriver) driver).queryAppState(appPackage));
    }
}
