import objectsiteducks.helpers.Browsers;
import objectsiteducks.helpers.ScreenshotListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import java.time.Duration;

@Listeners(ScreenshotListener.class)
public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));
        switch (browser) {
            case chrome: {
                System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
            case firefox: {
                System.setProperty("webdriver.firefox.driver","C:\\SeleniumDrivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            }
        }
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
