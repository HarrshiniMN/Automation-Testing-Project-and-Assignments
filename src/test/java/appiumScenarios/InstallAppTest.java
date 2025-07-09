package appiumScenarios;

import org.testng.annotations.Test;
import generic.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class InstallAppTest {
    @Test
    public void installApp() throws InterruptedException {
        AppiumDriver driver = Utility.createDriverSession();
        String appPackage = "io.appium.android.apis";

        // Uninstall app first (if installed)
        if (((AndroidDriver) driver).isAppInstalled(appPackage)) {
            ((AndroidDriver) driver).removeApp(appPackage);
            System.out.println("App uninstalled before installing.");
        }

        Thread.sleep(3000);

        // Path to your APK
        String path = "/Users/harrshinimn/Desktop/Harrshini_WebDriverDemos/AndroidMobileTesting/src/test/resources/ApiDemos-debug (1).apk";

        // Install app
        ((AndroidDriver) driver).installApp(path);
        System.out.println("App installed.");

        Thread.sleep(3000);

        // Launch app
        ((AndroidDriver) driver).activateApp(appPackage);
        System.out.println("App activated. Current state: " + ((AndroidDriver) driver).queryAppState(appPackage));
    }
}
