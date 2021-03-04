package com.pageObject;

import com.octonion.pageObject.BasePage;
import com.octonion.pageObject.MenuPanel;
import com.octonion.pageObject.ProjectsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateProjectTest extends BaseTest {

    //todo verify projects page opened
    //todo here to insert device name

    @Test
    public void verifyProjectCreated() throws InterruptedException {

        projectsPage.clickAvailableDevicesDrpd();
        projectsPage.clickSelectDevice();
        projectsPage.clickAvailableDevicesDrpd();
        projectsPage.clickAddToTheProjectBtn();
    }

}
