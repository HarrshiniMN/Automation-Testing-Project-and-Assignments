package mobileTest;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class Test1 {
	
	private AndroidDriver driver;

	@Test
	
	public void launchApp() throws MalformedURLException{
		UiAutomator2Options options = new UiAutomator2Options();
		
		
		options.setDeviceName("emulator-5554"); // Change if using a different emulator name 
        options.setPlatformName("Android");
        options.setApp("/Users/harrshinimn/Desktop/Harrshini_WebDriverDemos/AndroidMobileTesting/src/test/resources/ApiDemos-debug(1).apk");
        options.setAutomationName("UiAutomator2");
        
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        System.out.println("App launched successfully!");
        System.out.println("The session id is:" + driver.getSessionId());
    }
}