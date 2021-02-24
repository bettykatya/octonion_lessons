package com.octonion.automation_lessons.realt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    private LoginPopup loginPopup;

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
}
