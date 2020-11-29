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
        driver.quit();
    }
}
