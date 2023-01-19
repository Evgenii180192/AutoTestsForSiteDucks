import io.qameta.allure.Description;
import objectsiteducks.NavigationSiteDucks;
import objectsiteducks.SortDucks;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collections;

public class SortDucksTest extends TestBase {

    @Description("Sorting ducks by name")
    @Test
    public void sortDuckNameTest() {
        SortDucks sortDucks = new SortDucks(driver);
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickSubcategory();
        sortDucks.sortDucksName();
        LOG.info("We take the names of ducks");
        String nameDucksGreenSort =
                driver.findElement(By.xpath("//div[@class='name'][contains(text(), 'Green DucK')]")).getText();
        String nameDucksYellowSort =
                driver.findElement(By.xpath("//div[@class='name'][contains(text(), 'Yellow Duck')]")).getText();
        LOG.info("We put the names of ducks in the collection and sort");
        ArrayList<String> sortListNameDucks = new ArrayList<>();
        sortListNameDucks.add(nameDucksGreenSort);
        sortListNameDucks.add(nameDucksYellowSort);
        Collections.sort(sortListNameDucks);
        for (String name : sortListNameDucks) {
            System.out.println(name);
        }
        LOG.info("We take the names of ducks and put them in the collection, but do not sort");
        String nameDucksGreen =
                driver.findElement(By.xpath("//div[@class='name'][contains(text(), 'Green DucK')]")).getText();
        String nameDucksYellow =
                driver.findElement(By.xpath("//div[@class='name'][contains(text(), 'Yellow Duck')]")).getText();
        ArrayList <String> notSortListNameDucks = new ArrayList<>();
        notSortListNameDucks.add(nameDucksGreen);
        notSortListNameDucks.add(nameDucksYellow);
        for (String name : notSortListNameDucks) {
            System.out.println(name);
        }
        Assert.assertEquals(sortListNameDucks, notSortListNameDucks);
    }

    @Description("Sorting ducks by price")
    @Test
    public void sortDucksPriceTest() {
        SortDucks sortDucks = new SortDucks(driver);
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickSubcategory();
        sortDucks.sortDucksPrice();
        LOG.info("We take the prices of ducks");
        String sortYellowDucksPrice = driver.findElement(By.xpath("//strong[@class='campaign-price']")).getText();
        String sortGreenDucksPrice = driver.findElement(By.xpath("//span[@class='price']")).getText();
        LOG.info("We put the prices of ducks in the collection and sort");
        ArrayList <String> sortListPriceDucks = new ArrayList<>();
        sortListPriceDucks.add(sortGreenDucksPrice);
        sortListPriceDucks.add(sortYellowDucksPrice);
        Collections.sort(sortListPriceDucks);
        for (String price : sortListPriceDucks) {
            System.out.println(price);
        }
        LOG.info("We take the prices of ducks and put them in the collection, but do not sort");
        String yellowDucksPrice = driver.findElement(By.xpath("//strong[@class='campaign-price']")).getText();
        String greenDucksPrice = driver.findElement(By.xpath("//span[@class='price']")).getText();
        ArrayList <String> listPriceDucks = new ArrayList<>();
        listPriceDucks.add(yellowDucksPrice);
        listPriceDucks.add(greenDucksPrice);
        for (String price : listPriceDucks) {
            System.out.println(price);
        }
        Assert.assertEquals(listPriceDucks, sortListPriceDucks);
    }
}
