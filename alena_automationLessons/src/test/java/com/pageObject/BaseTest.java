package com.pageObject;

import com.octonion.pageObject.LoginPage;
import com.octonion.pageObject.ProjectListing;
import com.octonion.pageObject.ProjectsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected ProjectsPage projectsPage;
    protected ProjectListing projectListing;

    @BeforeClass
    public void initDriver() {
        driver = new ChromeDriver();
        driver.navigate().to("https://exp6-spa-milfei.octonion.com/login");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        projectsPage = new ProjectsPage(driver);
        projectListing = new ProjectListing(driver);
    }

//    @AfterClass
//    public void close() {
//        driver.close();
//    }
}
