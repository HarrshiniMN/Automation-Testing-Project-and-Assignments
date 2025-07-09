package mobileTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AndroidDeviceConnectionTest {

    @Test
    public void capturingSessionID() throws MalformedURLException, URISyntaxException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("appium:automationName", "UiAutomator2");
        cap.setCapability("appium:deviceName", "pixel_5");
        cap.setCapability("appium:udid", "emulator-5554");

       
        cap.setCapability("appium:app", "/Users/harrshinimn/Desktop/Harrshini_WebDriverDemos/AndroidMobileTesting/src/test/resources/ApiDemos-debug (1).apk");


        URL appiumServerUrl = new URL("http://127.0.0.1:4723/");
        AndroidDriver driver = new AndroidDriver(appiumServerUrl, cap);

        System.out.println("Session id is: " + driver.getSessionId());
    }
}