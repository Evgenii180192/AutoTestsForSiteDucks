package objectsiteducks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortDucks {

    private By elementName =
            By.cssSelector("[href=\"https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/?category_id=2&page=1&sort=name\"]");
    private By elementPrice = By.cssSelector("[class=\"button active\"]");

    private WebDriver driver;

    public SortDucks(WebDriver driver) {
        this.driver = driver;
    }

    public void sortDucksName()  {
        driver.findElement(elementName).click();
    }

    public  void sortDucksPrice() {
        driver.findElement(elementPrice).click();
    }
}
