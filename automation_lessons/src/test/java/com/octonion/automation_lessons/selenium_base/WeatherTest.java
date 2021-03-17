package com.octonion.automation_lessons.selenium_base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WeatherTest {

    private WebDriver driver;
    private WebDriverWait wait;

//    @BeforeClass
//    public void setPathsToDrivers() {
//        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
//        System.setProperty("webdriver.firefox.driver", "C:/driver/geckodriver.exe");
//    }

    @BeforeMethod
    public void openChromeBrowser() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.gismeteo.by/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
    }

//    @BeforeMethod
//    public void openFirefoxBrowser() {
//        driver = new FirefoxDriver();
//        driver.navigate().to("https://www.gismeteo.by/");
//        driver.manage().window().maximize();
//    }

    @Test
    public void fondNotExistingElement() {
        WebElement monthWeatherLink = driver.findElement(By.xpath("//a[@title='Погода']"));
    }

    @Test
    public void clickWeatherMonth() {
//        WebElement monthWeatherLink = wait.until(d -> d.findElement(By.xpath("//a[@title='Погода в Минске на месяц']")));
        WebElement monthWeatherLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Погода в Минске на месяц']")));
//        WebElement monthWeatherLink = driver.findElement(By.xpath("//a[@title='Погода в Минске на месяц']"));
        monthWeatherLink.click();
    }

    @Test
    public void clickOnAllCities() {
        WebElement monthWeatherLink = driver.findElement(By.xpath("//a[@title='Погода в Минске на месяц']"));
        monthWeatherLink.click();

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='cities_item']/a"));
        for (int i = 0; i < elements.size(); i++) {
            WebElement webElement = elements.get(i);
            webElement.click();
            driver.navigate().back();
        }
    }

    @Test
    public void testSearch() {
        WebElement searchBox = driver.findElement(By.cssSelector("#js-search"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        searchBox.click();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

}
