package com.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AILabLogin {
    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/install/WebDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://exp7-spa-ai-lab.octonion.com/login/");
        driver.manage().window().maximize();

        WebElement emailInput = driver.findElement(By.cssSelector("input#email"));
        emailInput.sendKeys("amitrafanava@octonion.com");

        WebElement passwordInput = driver.findElement(By.cssSelector("input#password-field"));
        passwordInput.sendKeys("qwertyQ2");

        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        submitBtn.click();
        emailInput.findElements(By.xpath("//button[@type='submit']"));
//        Thread.sleep(5000);
//        Assert.assertFalse(emailInput.isDisplayed());

        driver.quit();
    }
}

