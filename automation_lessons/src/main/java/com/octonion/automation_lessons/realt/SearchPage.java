package com.octonion.automation_lessons.realt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage extends BasePage {
    private WebDriver driver;

    @FindBy(css = "form[name='tx_uedbflat_pi2']")
    private WebElement filterForm;

    @FindBy(css = ".select2-search__field")
    private WebElement cityInput;

    private WebElement cityDropdownValue;

    @FindBy(css = "a#search-list")
    private WebElement submitForm;

    @FindBy(css = ".location.color-graydark")
    private List<WebElement> location;

    @FindBy(css = ".paging-list .active + a")
    private WebElement nextPageBtn;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getFilterForm() {
        return filterForm;
    }

    public SearchPage enterCityInput(String city) {
        cityInput.sendKeys(city);
        return this;
    }

    public SearchPage clickCityDropdownValue(String city) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        cityDropdownValue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//li[contains(@class,'select2-results__option')][text()='%s']", city))));
        cityDropdownValue.click();
        return this;
    }

    public SearchPage submitForm() {
        submitForm.click();
        return this;
    }

    public List<WebElement> getLocation() {
        return location;
    }

    public SearchPage clickNextPageBtn() {
        nextPageBtn.click();
        return this;
    }
}
