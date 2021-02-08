package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {
    private WebDriver driver;

    @FindBy(css = "form[name='tx_uedbnewbuild_pi2']")
    private WebElement filterForm;

    @FindBy(css = "[title='Город']")
    private WebElement cityDropdown;

    @FindBy(css = "option[value='Копище']")
    private WebElement cityDropdownValue;

    @FindBy(css = "a#search-list")
    private WebElement submitForm;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getFilterForm() {
        return filterForm;
    }

    public SearchPage clickCityDropdown() {
        cityDropdown.click();
        return this;
    }

    public SearchPage clickCityDropdownValue() {
        cityDropdownValue.click();
        return this;
    }

    public SearchPage submitForm() {
        submitForm.click();
        return this;
    }
}
