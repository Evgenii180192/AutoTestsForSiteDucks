import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import objectsiteducks.NavigationSiteDucks;

@Story("Checking the transition on all links in the header of the main page")

public class NavigationSiteDucksTest extends TestBase {

    @Test
    public void loadingOpenSiteDucksTest() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store1");
    }

    @Test
    public void clickRubberDucksTest() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickRubberDucks();
        Assert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store1");
    }

    @Test
    public void clickDeliveryInformationTest() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickDeliveryInformation();
        Assert.assertEquals(driver.getTitle(), "Delivery Information | My Store1");
    }

    @Test
    public void clickTermsConditionsTest() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickTermsConditions();
        Assert.assertEquals(driver.getTitle(), "Terms & Conditions | My Store1");
    }

    @Test
    public void clickDiscountsPromotions() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickDiscountsPromotions();
        Assert.assertEquals(driver.getTitle(), "4 | My Store1");
    }

    @Test
    public void clickSubcategory() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickSubcategory();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Subcategory | My Store1");
    }

    @Test
    public void clickButtonHome() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickButtonHome();
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store1");
    }
}
