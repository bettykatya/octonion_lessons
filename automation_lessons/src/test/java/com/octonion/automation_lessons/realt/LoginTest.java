package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    private WebDriver driver;

    @BeforeClass
    public void initDriver() {
        driver = new ChromeDriver();
        driver.navigate().to("https://realt.by/");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyOpenLoginPopup() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickLogin();
    }

    @Test(dependsOnMethods = "verifyOpenLoginPopup")
    public void verifyEnterLoginData() {
        LoginPopup loginPopup = new LoginPopup(driver);
        loginPopup.enterLogin("katyakrechko@gmail.com");
        loginPopup.enterPassword("qwertyQ1");
        loginPopup.submit();
    }

    @AfterClass
    public void close() {
        driver.close();
    }
}
