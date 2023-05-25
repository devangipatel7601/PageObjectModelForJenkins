package org.example;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils{
    LoadProp loadProp = new LoadProp();
    String browserName = loadProp.getProperty("browser");

    MutableCapabilities sauceOptions = new MutableCapabilities();
    public String USERNAME = loadProp.getProperty("SAUCE_USERNAME");
    public String ACCESS_KEY = loadProp.getProperty("SAUCE_ACCESS_KEY");
    public String URL = "https://"+ USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com/wd/hub";
    public boolean SAUCE_LAB =true;


    public void openBrowser() {

        System.out.println();
        if (SAUCE_LAB) {
            System.out.println("Running in Saucelab........with browser " + browserName);
            if (browserName.equalsIgnoreCase("Chrome")) {
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setExperimentalOption("w3c", true);
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "112");
                browserOptions.setCapability("sauce:options", sauceOptions);

                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }


            } else if (browserName.equalsIgnoreCase("Firefox")) {
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "112");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else if (browserName.equalsIgnoreCase("Edge")) {
                EdgeOptions browserOptions = new EdgeOptions();
                browserOptions.setExperimentalOption("w3c", true);
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "112");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        } else{
            // System.out.println("browser name is wrong or not implemented: " + browserName);


            if (browserName.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();

            } else if (browserName.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();

            } else {
                System.out.println("Your browser name is wrong or not implemented: " + browserName);
            }
        }
        //open url
        driver.get(loadProp.getProperty("url"));

        //maximize window
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    public void closeBrowser()
    {

        driver.close();
    }

}
