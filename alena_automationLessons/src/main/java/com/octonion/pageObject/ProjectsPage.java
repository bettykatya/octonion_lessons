package com.octonion.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectsPage extends BasePage {

    private WebDriver driver;
    private String name;

    @FindBy(xpath = "//button[@class='btn btn--floating oct-h8']")
    private WebElement addDeviceBtn;

    @FindBy(xpath = "//input[@id=\"project-name\"]")
    private WebElement nameInputField;

    @FindBy(xpath = "//div[@class='select-dropdown css-2b097c-container']")
    private WebElement availableDevicesDrpd;

    @FindBy(xpath = "//*[div[text()='29f']]")
    private WebElement selectDevice;


    @FindBy(xpath = "//button[@class='btn btn--contained oct-h9 btn--primary']")
    private WebElement addToTheProjectBtn;

    public ProjectsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void inputName(String name) {
        nameInputField.sendKeys(name);
    }

    public void clickAddDeviceBtn() {
        addDeviceBtn.click();
    }

    public void clickAvailableDevicesDrpd() {
        availableDevicesDrpd.click();
    }

    public void clickSelectDevice() {
        selectDevice.click();
    }

    public void clickAddToTheProjectBtn() {
        addToTheProjectBtn.click();
    }

}
