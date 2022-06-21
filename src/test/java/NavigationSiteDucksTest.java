import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import objectsiteducks.NavigationSiteDucks;

@Story("Checking the transition on all links in the header of the main page")
public class NavigationSiteDucksTest extends TestBase {

    @Description("Click on the link and compare the title of the page")
    @Test
    public void loadingOpenSiteDucksTest() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        LOG.info("Loading the main page of the site");
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store1");
    }

    @Description("Click on the link and compare the title of the page")
    @Test
    public void clickRubberDucksTest() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        LOG.info("We click on the link Rubber Ducks");
        navigationSiteDucks.clickRubberDucks();
        Assert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store1");
    }

    @Description("Click on the link and compare the title of the page")
    @Test
    public void clickDeliveryInformationTest() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        LOG.info("We click on the link Delivery Information");
        navigationSiteDucks.clickDeliveryInformation();
        Assert.assertEquals(driver.getTitle(), "Delivery Information | My Store1");
    }

    @Description("Click on the link and compare the title of the page")
    @Test
    public void clickTermsConditionsTest() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        LOG.info("We click on the link Terms Conditions");
        navigationSiteDucks.clickTermsConditions();
        Assert.assertEquals(driver.getTitle(), "Terms & Conditions | My Store1");
    }

    @Description("Click on the link and compare the title of the page")
    @Test
    public void clickDiscountsPromotions() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        LOG.info("We click on the link Discounts & Promotion");
        navigationSiteDucks.clickDiscountsPromotions();
        Assert.assertEquals(driver.getTitle(), "4 | My Store1");
    }

    @Description("Click on the link and compare the title of the page")
    @Test
    public void clickSubcategory() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        LOG.info("We click on the link Subcategory");
        navigationSiteDucks.clickSubcategory();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Subcategory | My Store1");
    }

    @Description("Click on the link and compare the title of the page")
    @Test
    public void clickButtonHome() {
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        LOG.info("We click on the button Home");
        navigationSiteDucks.clickButtonHome();
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store1");
    }
}
