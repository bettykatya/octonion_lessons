package com.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrainiumLogin {
    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/install/WebDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://exp6-spa-milfei.octonion.com/login");
        driver.manage().window().maximize();

        WebElement emailInput = driver.findElement(By.cssSelector("input#email"));
        emailInput.sendKeys("amitrafanava@octonion.com");

        WebElement passwordInput = driver.findElement(By.cssSelector("input#password-field"));
        passwordInput.sendKeys("qwertyQ1");

        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        submitBtn.click();
        emailInput.findElements(By.xpath("//button[@type='submit']"));
        Thread.sleep(5000);
        WebElement checkBox = driver.findElement(By.xpath("//div[@class='custom-icon left-sidebar__link-icon']"));

// create project
        WebElement createProjectBtn1 = driver.findElement(By.xpath("//button[@class='btn btn--floating oct-h8']"));
        createProjectBtn1.click();
        WebElement nameInput = driver.findElement(By.xpath("//input[@id=\"project-name\"]"));
        nameInput.sendKeys("test");
        WebElement createProjectBtn2 = driver.findElement(By.xpath("//span[text()=\"Create Project\"]/ancestor::button"));
        createProjectBtn2.click();

        //add device to project  -- not work -  element not interactable
        WebElement addDeviceBtn = driver.findElement(By.xpath("//div[@class='btn--floating__label']"));
        addDeviceBtn.click();
        Thread.sleep(1000);
        WebElement addToTheProjectBtn = driver.findElement(By.xpath("//button[@class='btn btn--contained oct-h9 btn--primary']"));
        addToTheProjectBtn.click();

        //add widget
        WebElement projectsTab = driver.findElement(By.xpath("//button[@aria-controls='tabs--24--panel--0']"));
        projectsTab.click();


//        driver.quit();
    }
}

