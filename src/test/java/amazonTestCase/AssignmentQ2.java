package amazonTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.URL;

public class AssignmentQ2 {

    WebDriver driver;
    String nodeURL;

    @Parameters("browser")
    @BeforeMethod
    public void setup(String browser) throws Exception {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            nodeURL = "http://localhost:4444/wd/hub";
            driver = new RemoteWebDriver(new URL(nodeURL), options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            nodeURL = "http://host.docker.internal:4444/wd/hub";
            driver = new RemoteWebDriver(new URL(nodeURL), options);
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            nodeURL = "http://localhost:4444/wd/hub";
            driver = new RemoteWebDriver(new URL(nodeURL), options);
        }
        driver.manage().window().maximize();
    }

    @Test
    public void openAmazon() {
        driver.get("https://www.amazon.in");
        System.out.println("Page Title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
