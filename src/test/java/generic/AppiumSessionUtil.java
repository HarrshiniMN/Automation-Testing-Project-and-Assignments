package generic;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumSessionUtil {
	public static AppiumDriver driver;

    public static AppiumDriver createDriverSession() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");

        // Use your absolute app path here
        String appPath = "/Users/harrshinimn/Desktop/Harrshini_WebDriverDemos/AndroidMobileTesting/src/test/resources/ApiDemos-debug (1).apk";
        options.setCapability("appium:app", appPath);

        // Set device details
        options.setDeviceName("pixel_5");
        options.setUdid("emulator-5554");

        try {
            URL serverUrl = new URI("http://127.0.0.1:4723").toURL();
            driver = new AndroidDriver(serverUrl, options);
            System.out.println("Session ID: " + driver.getSessionId());
        } catch (MalformedURLException | URISyntaxException e) {
            e.printStackTrace();
        }

        return driver;
    }

    public static void getScreenshot() {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            // Create Screenshots folder inside project root if it doesn't exist
            String projectRoot = System.getProperty("user.dir");
            File screenshotsFolder = new File(projectRoot + "/Screenshots");
            if (!screenshotsFolder.exists()) {
                boolean created = screenshotsFolder.mkdirs();
                System.out.println("Screenshots folder created: " + created);
            }

            File dest = new File(screenshotsFolder, "Appium_" + System.currentTimeMillis() + ".png");
            FileHandler.copy(src, dest);
            System.out.println("Screenshot saved at: " + dest.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
	