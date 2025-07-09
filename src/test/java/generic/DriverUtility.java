package generic;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverUtility {
    public static AppiumDriver driver;

    public static AppiumDriver createDriverSession() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setUdid("emulator-5554");
        options.setDeviceName("pixel_5");

        String path = "/Users/harrshinimn/Desktop/Harrshini_WebDriverDemos/AndroidMobileTesting/src/test/resources/ApiDemos-debug (1).apk";
        options.setCapability("appium:app", path);

        try {
            URL url = new URI("http://127.0.0.1:4723").toURL();
            driver = new AndroidDriver(url, options);
            System.out.println("Session ID: " + driver.getSessionId());
        } catch (MalformedURLException | URISyntaxException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
