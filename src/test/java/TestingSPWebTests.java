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
   /*ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    WebDriver driver = new ChromeDriver(options);
    driver.get("http://localhost:8080/ssgs-ems-profile-editor");
    WebElement elementName = driver.findElement(By.name("uname"));
    elementName.sendKeys("Gouri");
    elementName.sendKeys(Keys.TAB);
    WebElement elementPwd= driver.findElement(By.name("pwd"));
    elementPwd.sendKeys("Sohoni");
    elementPwd.sendKeys(Keys.TAB);
    WebElement elementLogin =     driver.findElement(By.name("submoit"));
    elementLogin.sendKeys(Keys.ENTER);
    Thread.sleep(4000);
    driver.quit();/*
}
