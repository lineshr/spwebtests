package parallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class TestingBotTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities capabillities = DesiredCapabilities.firefox();
        capabillities.setCapability("name", "Testing Selenium");

        driver = new RemoteWebDriver(
                new URL("https://localhost"),capabillities);
    }

    @Test
    public void testSimple() throws Exception {
        driver.get("https://testingbot.com/");
        String searchHeader = driver.findElement(By.cssSelector("H1"))
                .getText().toLowerCase();

        Assert.assertTrue(searchHeader.contains("Browser Testing"));
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}
