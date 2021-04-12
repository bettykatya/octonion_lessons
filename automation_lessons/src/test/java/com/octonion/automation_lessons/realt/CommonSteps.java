package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CommonSteps {

    public static AccountPage login(MainPage mainPage) {
        LoginPopup loginPopup = mainPage.clickLogin();
        Assert.assertTrue(loginPopup.getHeaderLbl().isDisplayed());
        loginPopup.enterLogin("katyakrechko@gmail.com");
        loginPopup.enterPassword("qwertyQ1");
        loginPopup.submit();
        Assert.assertTrue(mainPage.getLogoutBtn().isDisplayed());
        return new AccountPage(mainPage.driver);
    }

    public static MainPage openMainPageByLogo(WebDriver driver) {
        BasePage basePage = new BasePage(driver);
        basePage.clickLogo();
        return new MainPage(driver);
    }


}
