package com.pageObject;

import com.octonion.pageObject.LoginPage;
import org.testng.annotations.Test;

public class LoginTest {
    private LoginPage loginPage;

    @Test
    public void verifyEnterLoginData() {
        loginPage.enterEmail("amitrafanava@octonion.com");
        loginPage.enterPassword("qwertyQ1");
        loginPage.submit();
//        Assert.assertTrue(menuPanel.getCheckBox().isDisplayed());
    }

}
