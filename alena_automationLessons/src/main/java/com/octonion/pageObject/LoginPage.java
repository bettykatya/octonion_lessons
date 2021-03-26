package com.octonion.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    private WebDriver driver;
//    private emailInput;

    @FindBy(css = "input#email")
    private WebElement emailInput;

    @FindBy(css = "input#password-field")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitBtn;

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String psw) {
        passwordInput.sendKeys(psw);
    }

    public void submit() {
        submitBtn.click();
    }

     public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
     }

}
