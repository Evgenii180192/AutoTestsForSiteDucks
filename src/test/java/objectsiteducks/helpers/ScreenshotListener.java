package objectsiteducks.helpers;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ScreenshotListener implements ITestListener {

    WebDriver driver;

    @Override
    public void onTestFailure(ITestResult testResult) {
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            Allure.addAttachment(testResult.getTestName() + "screenshot", new FileInputStream(screenshot));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
