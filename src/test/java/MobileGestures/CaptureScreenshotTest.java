package MobileGestures;

import org.testng.annotations.Test;
import generic.AppiumSessionUtil;
import io.appium.java_client.AppiumDriver;

public class CaptureScreenshotTest {

    @Test
    public void takingScreenshot() {
        AppiumDriver driver = AppiumSessionUtil.createDriverSession();
        AppiumSessionUtil.getScreenshot();
      
        // Quit driver after screenshot
        if (driver != null) {
            driver.quit();
        }
    }
}