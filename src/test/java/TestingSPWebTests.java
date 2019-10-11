import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class TestingSPWebTests {
    private WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
        capabilities.setCapability("name", "Testing Selenium");

        driver = new RemoteWebDriver(new URL("http://51.144.224.181:4444/wd/hub/"),capabilities);
    }

    @Test
    public void testSimple() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("heelo");

    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}
