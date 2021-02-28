package com.octonion.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPanel extends BasePage{
    @FindBy(xpath = "//div[@class='custom-icon left-sidebar__link-icon']")
    private WebElement checkBox;

    public WebElement getCheckBox() {
        return checkBox;
    }
}
