package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    private WebDriver driver;
    private LoginPopup loginPopup;
    private MainPage mainPage;

    @BeforeClass
    public void initDriver() {
        driver = new ChromeDriver();
        driver.navigate().to("https://realt.by/");
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
    }

    @Test
    public void verifyOpenLoginPopup() {
        loginPopup = mainPage.clickLogin();
        Assert.assertTrue(loginPopup.getHeaderLbl().isDisplayed());
    }

    @Test(dependsOnMethods = "verifyOpenLoginPopup")
    public void verifyEnterLoginData() {
        loginPopup.enterLogin("katyakrechko@gmail.com");
        loginPopup.enterPassword("qwertyQ1");
        loginPopup.submit();
        Assert.assertTrue(mainPage.getLogoutBtn().isDisplayed());
    }

    @AfterClass
    public void close() {
        driver.close();
    }
}