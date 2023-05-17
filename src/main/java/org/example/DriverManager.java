package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
    LoadProp loadProp = new LoadProp();
    String browserName = loadProp.getProperty("browser");
    @BeforeMethod
    public void openBrowser() {
        if (browserName.equalsIgnoreCase("Chrome")) {
            //Open Chrome browser
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            //Open Firefox browser
            driver =new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("edge")) {
            //Open Edge browser
            driver =new EdgeDriver();

        }else {
            System.out.println("Browser name is wrong or not implemented :" + browserName);
        }
        //type the url
        driver.get(loadProp.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       }
    @AfterMethod

    public  void closeBrowser() {
        driver.close();
    }
}
