import io.qameta.allure.Description;
import objectsiteducks.ButtonScroll;
import org.testng.annotations.Test;

public class CheckButtonScrollTest extends TestBase {

    @Description("Scroll button click check")
    @Test
    public void clickButtonScroll() {
        ButtonScroll buttonScroll = new ButtonScroll(driver);
        buttonScroll.clickButtonScroll();
    }

}
