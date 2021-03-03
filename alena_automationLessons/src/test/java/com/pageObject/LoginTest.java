package com.pageObject;

import com.octonion.pageObject.LoginPage;
import com.octonion.pageObject.MenuPanel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{


    @Test
    public void verifyEnterLoginData() throws InterruptedException {
        loginPage.enterEmail("amitrafanava@octonion.com");
        loginPage.enterPassword("qwertyQ1");
        loginPage.submit();
        Thread.sleep(10000);
        MenuPanel menuPanel = new MenuPanel(driver);
        Assert.assertTrue(menuPanel.getCheckBox().isDisplayed());
    }

}
