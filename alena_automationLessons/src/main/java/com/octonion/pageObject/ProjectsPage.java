package com.octonion.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

public class ProjectsPage extends BasePage {

    private WebDriver driver;
    private String name;
    private String deviceName = "abs";

    @FindBy(xpath = "//button[@class='btn btn--floating oct-h8']")
    private WebElement addDeviceBtn;

//    @FindBy(xpath = "//input[@id=\"project-name\"]")
//    private WebElement nameInputField;

    @FindBy(xpath = "//div[@class='select-dropdown css-2b097c-container']")
    private WebElement availableDevicesDrpd;

    @FindBy(css = "//div[@class='select-dropdown css-2b097c-container']")                                                  
    private WebElement availableDevices;

    @FindBy(xpath = "//*[div[text()='%s']]", deviceName)
    private WebElement selectDevice;
    //todo device variable


    @FindBy(xpath = "//button[@class='btn btn--contained oct-h9 btn--primary']")
    private WebElement addToTheProjectBtn;

    @FindBy(xpath = "//button[@aria-controls='tabs--1--panel--0']")
    private WebElement createWidgetBtn;

    @FindBy(xpath = "//button[.//span[text()='Create Widget']]")
    private WebElement onDropdown;

    @FindBy(xpath = "//input[@id='react-select-4-input']")
    private WebElement widgetTypeInput;

    @FindBy(xpath = "//div[@class=' css-lnoo1q-menu']")
    private WebElement insideDropdown;

    @FindBy(xpath = "//*[@class=' css-17uj9bd-placeholder'][text()='Visualization type']")
    private WebElement visualisationDropdown;

    @FindBy(xpath = "//input[@id='react-select-5-input']")
    private WebElement visualisationType;

    @FindBy(xpath = "//div[span[text()='Finish']]")
    private WebElement finishBtn;

    public ProjectsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    public void inputName(String name) {
//        nameInputField.sendKeys(name);
//    }

    public void clickAddDeviceBtn() {
        addDeviceBtn.click();
    }

    public void clickAvailableDevicesDrpd(String device) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        availableDevicesDrpd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//*[div[text()='%s']]", device))));
        availableDevicesDrpd.click();
    }

//    public void clickSelectDevice() {
//        selectDevice.click();
//    }

    public void clickAddToTheProjectBtn() {
        addToTheProjectBtn.click();
    }

    public void clickCreateWidgetBtn() {
        createWidgetBtn.click();
    }

    public void clickOnDropdown() {
        onDropdown.click();
    }

    public void doWidgetTypeInput() {
        widgetTypeInput.sendKeys("Sound level");
        //todo change to variable
    }

    public void clickInsideDropdown() {
        insideDropdown.click();
    }

    public void clickVisualisationDropdown() {
        visualisationDropdown.click();
    }

    public void inputVisualisationType() {
        visualisationType.sendKeys("Line");
    }

    public void clickFinishBtn() {
        finishBtn.click();
    }

    public void enterDeviceName(String device) {
        availableDevices.sendKeys(device);
    }
}
