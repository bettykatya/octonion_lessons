package com.pageObject;

import com.octonion.pageObject.LoginPage;
import com.octonion.pageObject.MenuPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;
    public MenuPanel menuPanel;
    private LoginPage loginPage;

    @BeforeClass
    public void initDriver() {
        driver = new ChromeDriver();
        driver.navigate().to("https://exp6-spa-milfei.octonion.com/login");
        driver.manage().window().maximize();
//        loginPage = new LoginPage(driver);
    }

    @Test
    public void verifyEnterLoginData() {
        loginPage.enterEmail("amitrafanava@octonion.com");
        loginPage.enterPassword("qwertyQ1");
        loginPage.submit();
        Assert.assertTrue(menuPanel.getCheckBox().isDisplayed());
    }
}
