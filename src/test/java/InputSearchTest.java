import io.qameta.allure.Description;
import objectsiteducks.InputSearch;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputSearchTest extends TestBase {
    @Description("Checking the search field by entering the name of a duck")
    @Test
    public void checkInputSearchTest() {
        InputSearch inputSearch = new InputSearch(driver);
        inputSearch.inputSearchField();
        Assert.assertEquals(driver.getTitle(), "Purple Duck | Rubber Ducks | My Store1");
    }
}
