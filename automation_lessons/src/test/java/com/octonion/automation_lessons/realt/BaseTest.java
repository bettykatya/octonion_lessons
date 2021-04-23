package com.octonion.automation_lessons.realt;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//todo use generics (?)
public class BaseTest {

    protected WebDriver driver;
    protected MainPage mainPage;

    @BeforeClass
    public void initDriver() {
        driver = new ChromeDriver();
        driver.navigate().to("https://realt.by/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
    }

    @AfterClass
    public void close() {
        driver.close();
    }

    @AfterMethod
    public void screenShot(ITestResult result) {
//        if (ITestResult.FAILURE == result.getStatus()) {
        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File src = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.getFileUtils().copyFile(src, new File(String.format("C:\\selenium\\%s_%d.png", result.getName(), new Date().getTime())));
            System.out.println(src.getAbsolutePath());
            System.out.println("Successfully captured a screenshot");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }
//        }
    }

    protected boolean isLastPage(int i, int totalPageNumber) {
        return i == totalPageNumber - 1;
    }
}