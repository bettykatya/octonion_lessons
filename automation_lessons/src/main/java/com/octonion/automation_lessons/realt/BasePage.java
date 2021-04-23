package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    @FindBy(css = ".auth-link a")
    protected WebElement loginBtn;

    @FindBy(css = ".main-header-top .main-header-right a.btn")
    protected WebElement logoutBtn;

    @FindBy(css = ".logo")
    protected WebElement logoLink;

    @FindBy(css = "[title='Избранные объявления']")
    protected WebElement favoriteAdsBtn;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPopup clickLogin() {
        loginBtn.click();
        return new LoginPopup(driver);
    }

    public WebElement getLogoutBtn() {
        return logoutBtn;
    }

    public MainPage clickLogo() {
        logoLink.click();
        return new MainPage(driver);
    }

    public AccountPage clickFavoriteAdsBtn() {
        favoriteAdsBtn.click();
        return new AccountPage(driver);
    }
}