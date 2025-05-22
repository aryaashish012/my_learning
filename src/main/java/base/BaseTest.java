package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    public static WebDriver driver;
    public static Properties prop;

    public void initDriver() {
        prop = ConfigReader.initProperties();
        String browser = prop.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
