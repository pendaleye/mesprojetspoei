package utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static final ExtentReports extent = new ExtentReports();

    static {
        ExtentSparkReporter reporter = new ExtentSparkReporter("extentReport.html");
        extent.attachReporter(reporter);
    }

    public static ExtentReports getInstance() {
        return extent;
    }
}
