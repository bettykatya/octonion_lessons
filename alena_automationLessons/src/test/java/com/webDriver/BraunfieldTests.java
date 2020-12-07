package com.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

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
        WebElement checkBox = driver.findElement(By.xpath("//div[@class='custom-icon left-sidebar__link-icon']"));
    }

    // create project
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
        WebElement addToTheProjectBtn = driver.findElement(By.xpath("//button[@class='btn btn--contained oct-h9 btn--primary']"));
        addToTheProjectBtn.click();
    }

    //    List<WebElement> addDeviceBtn = driver.findElements(By.xpath("//button[@class='btn btn--floating oct-h8']"));
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
        Thread.sleep(5000);

        WebElement visualisationTypeInput = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
        visualisationTypeInput.sendKeys("Line chart");

        WebElement finishBtn = driver.findElement(By.xpath("//button[.//span[text()='Finish']]"));
        finishBtn.click();
    }

//        driver.quit();
}



