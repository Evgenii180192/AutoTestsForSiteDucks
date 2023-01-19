package objectsiteducks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ButtonScroll {
    private By elementButtonScroll = By.cssSelector("[class=\"fa fa-chevron-circle-up fa-3x\"]");

    private WebDriver driver;

    public ButtonScroll(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonScroll() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,650)", "");
        driver.findElement(elementButtonScroll).click();
    }
}
