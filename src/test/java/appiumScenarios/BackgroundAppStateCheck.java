package appiumScenarios;

import java.time.Duration;
import org.testng.annotations.Test;
import generic.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BackgroundAppStateCheck {
    @Test
    public void backgroundAppAndCheckState() throws InterruptedException {
        AppiumDriver driver = Utility.createDriverSession();
        String appPackage = "io.appium.android.apis";

        System.out.println("Initial state: " + ((AndroidDriver) driver).queryAppState(appPackage));

        // Send app to background for 6 seconds
        ((AndroidDriver) driver).runAppInBackground(Duration.ofSeconds(6));
        System.out.println("State after background: " + ((AndroidDriver) driver).queryAppState(appPackage));
    }
}
