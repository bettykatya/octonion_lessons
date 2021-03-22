package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(xpath = "//div[@id='residentialInputs']//span[text()='Расширенный поиск']")
    private WebElement searchBtn;

    public SearchPage clickSearch() {
        searchBtn.click();
        return new SearchPage(driver);
    }

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
