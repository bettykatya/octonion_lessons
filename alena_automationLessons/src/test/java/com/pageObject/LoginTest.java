package com.pageObject;

import com.octonion.pageObject.LoginPage;
import com.octonion.pageObject.MenuPanel;
import com.octonion.pageObject.ProjectsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
//    private ProjectsPage projectsPage;


    @Test
    public void verifyEnterLoginData() throws InterruptedException {
        loginPage.enterEmail("amitrafanava@octonion.com");
        loginPage.enterPassword("qwertyQ1");
        loginPage.submit();
        Thread.sleep(2000);
        MenuPanel menuPanel = new MenuPanel(driver);
        Assert.assertTrue(menuPanel.getCheckBox().isDisplayed());
    }

    @Test(dependsOnMethods = "verifyEnterLoginData")
    public void verifyProjectCreated() throws InterruptedException {
        Thread.sleep(2000);
        projectsPage.clickAddDeviceBtn();
        Thread.sleep(2000);
        projectsPage.inputName("test1");
        Thread.sleep(2000);
        projectsPage.clickAddToTheProjectBtn();
        projectsPage.inputName("test1");
        Thread.sleep(2000);
        projectsPage.clickAddDeviceBtn();
        projectsPage.clickAvailableDevicesDrpd();
//        projectsPage.clickSelectDevice();
//        projectsPage.clickAddToTheProjectBtn();
    }

}
