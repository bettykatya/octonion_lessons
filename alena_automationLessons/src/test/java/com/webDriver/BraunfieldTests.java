package com.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BraunfieldTests {
    WebDriver driver;

    @BeforeClass
    public void openDriver() {
        System.setProperty("webdriver.chrome.driver", "D:/install/WebDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://exp6-spa-milfei.octonion.com/login");
        driver.manage().window().maximize();
    }

    @Test
    public void login() throws InterruptedException {

        WebElement emailInput = driver.findElement(By.cssSelector("input#email"));
        emailInput.sendKeys("amitrafanava@octonion.com");

        WebElement passwordInput = driver.findElement(By.cssSelector("input#password-field"));
        passwordInput.sendKeys("qwertyQ1");

        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        submitBtn.click();
        emailInput.findElements(By.xpath("//button[@type='submit']"));
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "login")
    public void createProject() {
        WebElement createProjectBtn1 = driver.findElement(By.xpath("//button[@class='btn btn--floating oct-h8']"));
        createProjectBtn1.click();
        WebElement nameInput = driver.findElement(By.xpath("//input[@id=\"project-name\"]"));
        nameInput.sendKeys("test");
        WebElement createProjectBtn2 = driver.findElement(By.xpath("//span[text()=\"Create Project\"]/ancestor::button"));
        createProjectBtn2.click();
    }

    @Test(dependsOnMethods = "createProject")
    public void addDevice() throws InterruptedException {
        //add device to project
        Thread.sleep(2000);
        WebElement addDeviceBtn = driver.findElement(By.xpath("//button[@class='btn btn--floating oct-h8']"));
        addDeviceBtn.click();
        Thread.sleep(2000);

        WebElement availableDevicesDrpd = driver.findElement(By.xpath("//div[@class='select-dropdown css-2b097c-container']"));
        availableDevicesDrpd.click();
        WebElement selectDevice = driver.findElement(By.xpath("//*[div[text()='29f']]"));
        selectDevice.click();
        WebElement addToTheProjectBtn = driver.findElement(By.xpath("//button[@class='btn btn--contained oct-h9 btn--primary']"));
        addToTheProjectBtn.click();
    }

    @Test(dependsOnMethods = "addDevice")
    public void addWidget() throws InterruptedException {
        WebElement createWidgetBtn = driver.findElement(By.xpath("//button[@aria-controls='tabs--1--panel--0']"));
        createWidgetBtn.click();
        Thread.sleep(2000);

        WebElement clickOnDropdown = driver.findElement(By.xpath("//button[.//span[text()='Create Widget']]"));
        clickOnDropdown.click();
        Thread.sleep(2000);
        WebElement widgetTypeInput = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
        widgetTypeInput.sendKeys("Sound level");
        WebElement clickInsideDropdown = driver.findElement(By.xpath("//div[@class=\" css-lnoo1q-menu\"]"));
        clickInsideDropdown.click();

        WebElement clickVisualisationDropdown = driver.findElement(By.xpath("//*[@class=' css-17uj9bd-placeholder'][text()='Visualization type']"));
        clickVisualisationDropdown.click();

        WebElement VisualisationTypeInput = driver.findElement(By.xpath("//input[@id='react-select-5-input']"));
        VisualisationTypeInput.sendKeys("Line");

        WebElement clickInsideVisualisationDrpd = driver.findElement(By.xpath("//div[@class=\" css-lnoo1q-menu\"]"));
        clickInsideVisualisationDrpd.click();

        WebElement finishBtn = driver.findElement(By.xpath(" //div[span[text()='Finish']]"));
        finishBtn.click();
    }

    @Test(dependsOnMethods = "addWidget")
    public void deleteWidget() throws InterruptedException {
        WebElement openProjects = driver.findElement(By.xpath("//a[@href=\"/projects\"]"));
        openProjects.click();
        Thread.sleep(2000);
        WebElement threeDropsMenu = driver.findElement(By.xpath("//div[@class='project-card__context-menu-button-wrapper']"));
        threeDropsMenu.click();
        WebElement removeLink = driver.findElement(By.xpath("//button[.//span[text()=\"Remove\"]]"));
        removeLink.click();
        WebElement confirmBtn = driver.findElement(By.xpath("//button[.//span[text()=\"Confirm\"]]"));
        confirmBtn.click();
        driver.quit();
    }
}



