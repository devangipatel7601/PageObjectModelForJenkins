package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{
    DriverManager driverManager = new DriverManager();

    @BeforeMethod
    public void setUp() {
        driverManager.openBrowser();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            captureScreenshot(result.getName());
        }
        driverManager.closeBrowser();

    }
}
