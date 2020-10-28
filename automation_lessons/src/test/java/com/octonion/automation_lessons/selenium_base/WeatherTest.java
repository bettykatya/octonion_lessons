package com.octonion.automation_lessons.selenium_base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

/*
www.gismeteo.by - открыть погоду на месяц и найти погоду на сегодня
 */
public class WeatherTest {


    @Test
    public void testSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.gismeteo.by/");
        driver.manage().window().maximize();

        Thread.sleep(5000);  // Let the user actually see something!

//        WebElement searchBox = driver.findElement(By.cssSelector("#js-search"));
//        searchBox.sendKeys("ChromeDriver");
//        searchBox.submit();
//        searchBox.click();
//
//        WebElement monthWeatherLink = driver.findElement(By.xpath("//a[@title='Погода в Минске на месяц']"));
//        monthWeatherLink.click();

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='cities_item']/a"));
        for (int i = 0; i < elements.size(); i++) {
            WebElement webElement = elements.get(i);
            webElement.click();
            driver.navigate().back();
        }

        Thread.sleep(5000);  // Let the user actually see something!

        driver.quit();
    }

}
