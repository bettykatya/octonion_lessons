package PageObjectsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void initDriver() {
        driver = new ChromeDriver();
        driver.navigate().to("https://stg5-spa-milfei.octonion.com/login");
        driver.manage().window().maximize();

    }

    @AfterClass
    public void closeDriver() {
    driver.close();
    }

}
