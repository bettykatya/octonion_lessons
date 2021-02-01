package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPopup {

    private WebDriver driver;

    @FindBy(css = "[name=user]")
    private WebElement loginInput;

    @FindBy(css = "[name=pass]")
    private WebElement passwordInput;

    @FindBy(css = "[type=submit]")
    private WebElement submitBtn;

    public LoginPopup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterLogin(String email) {
        loginInput.sendKeys(email);
    }

    public void enterPassword(String psw) {
        passwordInput.sendKeys(psw);
    }

    public void submit() {
        submitBtn.click();
    }
}
