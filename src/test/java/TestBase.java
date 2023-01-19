import objectsiteducks.helpers.Browsers;
import objectsiteducks.helpers.ScreenshotListener;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.time.Duration;

@Listeners(ScreenshotListener.class)
public class TestBase {
    protected Logger LOG = Logger.getLogger(TestBase.class);
    protected WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        LOG.info("Opening the browser");
        Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));
        switch (browser) {
            case chrome: {
                LOG.info("Browser opens Chrome");
                System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
            case firefox: {
                LOG.info("Browser opens Firefox");
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
        LOG.info("Close the browser");
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
