package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest {

    private WebDriver driver;
    private MainPage mainPage;

    @BeforeClass
    public void initDriver() {
        driver = new ChromeDriver();
        driver.navigate().to("https://realt.by/");
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
    }

    @Test
    public void verifyOpenSearchPage() {
        mainPage.clickSearch();
        //todo assert search page is opened
    }

    @AfterClass
    public void close() {
        driver.close();
    }
}
