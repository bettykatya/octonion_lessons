package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;

    @FindBy(css = ".auth-link a")
    private WebElement loginBtn;

    @FindBy(css = ".main-header-top .main-header-right a.btn")
    private WebElement logoutBtn;

    @FindBy(xpath = "//div[@id='residentialInputs']//span[text()='Расширенный поиск']")
    private WebElement searchBtn;

    public LoginPopup clickLogin() {
        loginBtn.click();
        return new LoginPopup(driver);
    }

    public void clickSearch() {
        searchBtn.click();
    }

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLogoutBtn() {
        return logoutBtn;
    }
}
