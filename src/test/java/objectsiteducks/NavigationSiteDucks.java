package objectsiteducks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NavigationSiteDucks {

    private By elementNavigationButtonHome = By.cssSelector("[class=\"fa fa-home\"]");
    private By elementNavigationRubberDucks = By.cssSelector("[href=\"https://litecart.stqa.ru/en/rubber-ducks-c-1/\"]");
    private By elementNavigationDeliveryInformation =
            By.cssSelector("[href=\"https://litecart.stqa.ru/en/delivery-information-i-2\"]");
    private By elementNavigationTermsConditions =
            By.cssSelector("[href=\"https://litecart.stqa.ru/en/terms-conditions-i-4\"]");
    private By elementNavigationDiscountsPromotions =
            By.cssSelector("[href=\"https://litecart.stqa.ru/en/skidki-i-akcii-i-5\"]");

    private   WebDriver driver;

    public NavigationSiteDucks(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRubberDucks() {
        driver.findElement(elementNavigationRubberDucks).click();
    }

    public void clickSubcategory() {
        WebElement elementNavigationRubberDucks =
                driver.findElement(By.cssSelector("[href=\"https://litecart.stqa.ru/en/rubber-ducks-c-1/\"]"));
        WebElement elementSubcategory =
                driver.findElement(By.cssSelector("[href=\"https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elementNavigationRubberDucks).moveToElement(elementSubcategory).click().perform();
    }

    public void clickDeliveryInformation() {
        driver.findElement(elementNavigationDeliveryInformation).click();
    }

    public void clickTermsConditions() {
        driver.findElement(elementNavigationTermsConditions).click();
    }

    public void clickDiscountsPromotions() {
        driver.findElement(elementNavigationDiscountsPromotions).click();
    }

    public void clickButtonHome() {
        driver.findElement(elementNavigationDiscountsPromotions).click();
        driver.findElement(elementNavigationButtonHome).click();
    }
}
