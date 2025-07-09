package appiumScenarios;

import java.io.File;
import org.testng.annotations.Test;

public class CreateFolderTest {
  @Test
  public void createScreenshotFolder() {
      String projectRoot = System.getProperty("user.dir");
      File screenshotsFolder = new File(projectRoot + "/Screenshots");

      if (!screenshotsFolder.exists()) {
          boolean created = screenshotsFolder.mkdirs();
          System.out.println("Screenshots folder created: " + created + " at " + screenshotsFolder.getAbsolutePath());
      } else {
          System.out.println("Screenshots folder already exists at " + screenshotsFolder.getAbsolutePath());
      }
  }
}