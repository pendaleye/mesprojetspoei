package listeners;

import base.BaseTest;
import org.openqa.selenium.*;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ExtentManager;
import com.aventstack.extentreports.*;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class TestListener implements ITestListener {
    private static ExtentReports extent = ExtentManager.getInstance();
    private static ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
        test.assignAuthor("Salim");
        test.assignCategory("TNR");
        test.assignDevice("Chrome on Windows v130");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail("Test Failed: " + result.getThrowable());

        WebDriver driver = ((BaseTest) result.getInstance()).driver;
        String screenshotPath = takeScreenshot(driver, result.getMethod().getMethodName());
        test.addScreenCaptureFromPath(screenshotPath);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed: " + result.getMethod().getMethodName());

        WebDriver driver = ((BaseTest) result.getInstance()).driver;
        String screenshotPath = takeScreenshot(driver, result.getMethod().getMethodName());
        test.addScreenCaptureFromPath(screenshotPath);
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }

    private String takeScreenshot(WebDriver driver, String testName) {
        String filePath = testName + ".png";
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath);
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePath;
    }
}
