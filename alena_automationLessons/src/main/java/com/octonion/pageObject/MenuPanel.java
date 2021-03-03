package com.octonion.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPanel extends BasePage{

    private WebDriver driver;

    @FindBy(xpath = "//div[@class='custom-icon left-sidebar__link-icon']")
    private WebElement checkBox;

    public WebElement getCheckBox() {
        return checkBox;
    }

    public MenuPanel(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
