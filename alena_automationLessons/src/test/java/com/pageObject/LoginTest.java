package com.pageObject;

import com.octonion.pageObject.MenuPanel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

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
//        Thread.sleep(2000);   похоже ненужная, очень странно
//        projectsPage.clickAddToTheProjectBtn();
        Thread.sleep(2000);
        projectsPage.clickAddDeviceBtn();
        Thread.sleep(2000);
        projectsPage.clickAvailableDevicesDrpd();
        projectsPage.clickSelectDevice();
        Thread.sleep(2000);
//todo click of selected device
//todo input of device name like for email
//todo waits
        projectsPage.clickAddToTheProjectBtn();
    }

}
