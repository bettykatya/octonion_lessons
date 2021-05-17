package com.pageObject;

import com.octonion.pageObject.MenuPanel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
private String device = "29f";

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
        //todo why when i run test i see  test1 duplicate
        Thread.sleep(2000);
        projectsPage.clickAddDeviceBtn();
        //delete comment when several devices
        Thread.sleep(2000);
        projectsPage.clickAvailableDevicesDrpd();
//        projectsPage.enterDeviceName("AI Module");
        Thread.sleep(2000);

//        projectsPage.clickSelectDevice();
        Thread.sleep(2000);
        projectsPage.clickAddToTheProjectBtn();
//        projectsPage.clickAddToTheProjectBtn();
    }
    //todo click of selected device
//todo input of device name like for email
//todo waits for elements

    @Test(dependsOnMethods = "verifyProjectCreated")
    public void addWidget() throws InterruptedException {
        projectsPage.clickCreateWidgetBtn();
        Thread.sleep(2000);
        projectsPage.clickOnDropdown();
        Thread.sleep(2000);
        projectsPage.doWidgetTypeInput();
        Thread.sleep(2000);
        projectsPage.clickInsideDropdown();
        projectsPage.clickVisualisationDropdown();
        projectsPage.inputVisualisationType();
        projectsPage.clickInsideDropdown();
        projectsPage.clickFinishBtn();
    }

    @Test(dependsOnMethods = "addWidget")
    public void deleteWidget() throws InterruptedException {
        projectListing.openProjectsListing();
        Thread.sleep(2000);
        projectListing.clickThreeDropsMenu();
        projectListing.doRemoveOfProject();
        projectListing.clickOnConfirmBtn();
    }

}
