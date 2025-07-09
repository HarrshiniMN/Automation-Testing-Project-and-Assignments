package MobileGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragAndDropTest {

    @Test
    public void testDragAndDropGesture() throws InterruptedException {
        AppiumDriver driver = DriverUtility.createDriverSession();

        // Navigate to Views
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        Thread.sleep(2000);

        // Go to Drag and Drop
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
        Thread.sleep(2000);

        // Find element to drag
        WebElement dragDot = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));

        // Perform the drag gesture
        driver.executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) dragDot).getId(),
                "endX", 729,
                "endY", 1156
        ));

        Thread.sleep(2000);

        // Capture and print result
        String result = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
        System.out.println("The result message is: " + result);
    }
}