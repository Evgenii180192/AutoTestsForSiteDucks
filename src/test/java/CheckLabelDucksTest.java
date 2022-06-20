import io.qameta.allure.Description;
import io.qameta.allure.Story;
import objectsiteducks.NavigationSiteDucks;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckLabelDucksTest extends TestBase {

    @Description("Yellow duck label check")
    @Test
    public void checkLabelYellowDuck() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickSubcategory();
        String labelTextYellowDuck =
                driver.findElement(By.xpath("//div[@class=\"sticker sale\"][contains(text(), 'Sale')]")).getText();
        System.out.println(labelTextYellowDuck);
        Assert.assertEquals(labelTextYellowDuck, "SALE");
    }

    @Description("Green duck label check")
    @Test
    public void checkLabelGreenDuck() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickSubcategory();
        String labelTextGreenDuck = driver.findElement(By.xpath("//div[@title=\"New\"]")).getText();
        System.out.println(labelTextGreenDuck);
        Assert.assertEquals(labelTextGreenDuck, "NEW");
    }
}
