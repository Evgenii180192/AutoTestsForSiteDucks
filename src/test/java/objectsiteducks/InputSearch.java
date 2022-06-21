package objectsiteducks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputSearch {
    private By elementInputSearch = By.xpath("//input[@type=\"search\"]");

    private WebDriver driver;

    public InputSearch(WebDriver driver) {
        this.driver = driver;
    }

    public void inputSearchField() {
        WebElement elementInputSearch = driver.findElement(By.xpath("//input[@type=\"search\"]"));
        elementInputSearch.click();
        elementInputSearch.sendKeys("Purple Duck", Keys.ENTER);
    }
}
