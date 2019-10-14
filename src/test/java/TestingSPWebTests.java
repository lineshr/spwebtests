import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class TestingSPWebTests {
    private static RemoteWebDriver driver;

    @BeforeClass
    public static void setUp() throws Exception {
        ChromeOptions chromeOptions = new ChromeOptions();

        driver = new RemoteWebDriver(new URL("http://40.114.124.244:4444/wd/hub/"),chromeOptions);
    }

    @Test
    public static void testSimple() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("heelo");

    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}
