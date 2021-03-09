package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected MainPage mainPage;

    @BeforeClass
    public void initDriver() {
        driver = new ChromeDriver();
        driver.navigate().to("https://realt.by/");
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
    }

    /*@AfterClass
    public void close() {
        driver.close();
    }*/
}
