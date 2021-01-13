package com.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BraunfieldTests {
    WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void openDriver() {
        System.setProperty("webdriver.chrome.driver", "D:/install/WebDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://exp6-spa-milfei.octonion.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30000);
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
    }

    @Test(dependsOnMethods = "login")
    public void createProject() {
        WebElement createProjectBtn1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn btn--floating oct-h8']")));
        createProjectBtn1.click();
        WebElement nameInput = driver.findElement(By.xpath("//input[@id=\"project-name\"]"));
        nameInput.sendKeys("test");
        WebElement createProjectBtn2 = driver.findElement(By.xpath("//span[text()=\"Create Project\"]/ancestor::button"));
        createProjectBtn2.click();
    }

    @Test(dependsOnMethods = "createProject")
    public void addDevice() throws InterruptedException {
// 'nj  lksdjlks       Thread.sleep(2000);
//        WebElement addDeviceBtn = driver.findElement(By.xpath("//button[@class='btn btn--floating oct-h8']"));
//        WebElement addDeviceBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn btn--floating oct-h8']")));
        WebElement addDeviceBtn = driver.findElement(By.xpath("//button[@class='btn btn--floating oct-h8']"));
        addDeviceBtn.click();

        WebElement availableDevicesDrpd = driver.findElement(By.xpath("//div[@class='select-dropdown css-2b097c-container']"));
        availableDevicesDrpd.click();
        WebElement selectDevice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[div[text()='29f']]")));
        selectDevice.click();
        WebElement addToTheProjectBtn = driver.findElement(By.xpath("//button[@class='btn btn--contained oct-h9 btn--primary']"));
        addToTheProjectBtn.click();
    }

    @Test(dependsOnMethods = "addDevice")
    public void addWidget() throws InterruptedException {
        WebElement createWidgetBtn = driver.findElement(By.xpath("//button[@aria-controls='tabs--1--panel--0']"));
        createWidgetBtn.click();

        WebElement clickOnDropdown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.//span[text()='Create Widget']]")));
        clickOnDropdown.click();
        WebElement widgetTypeInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='react-select-4-input']")));
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
        WebElement threeDropsMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='project-card__context-menu-button-wrapper']")));
        threeDropsMenu.click();
        WebElement removeLink = driver.findElement(By.xpath("//button[.//span[text()=\"Remove\"]]"));
        removeLink.click();
        WebElement confirmBtn = driver.findElement(By.xpath("//button[.//span[text()=\"Confirm\"]]"));
        confirmBtn.click();
        driver.quit();
    }
}



