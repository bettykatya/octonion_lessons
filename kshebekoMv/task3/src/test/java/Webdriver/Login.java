package Webdriver;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    //open browser, input email and pass, button sign in, close window

    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://exp7-spa-ai-lab.octonion.com/login");
        driver.manage().window().maximize();

        WebElement emailInput = driver.findElement(By.cssSelector("input#email"));
        emailInput.sendKeys("amitrafanava@octonion.com");

        WebElement passwordInput = driver.findElement(By.cssSelector("input#password-field"));
        passwordInput.sendKeys("qwertyQ1");

        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        submitBtn.click();
        Thread.sleep(5000);
        Assert.assertFalse(emailInput.isDisplayed());

        driver.quit();

    }

}
