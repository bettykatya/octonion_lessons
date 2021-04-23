package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(css = ".list-group-item")
    private WebElement btnDeleteFromFavorite;

    @FindBy(css=".btn.btn-success[data-bb-handler='confirm']")
    private WebElement btnConfirmDelete;

    public AccountPage deleteFromFavorite() {
        btnDeleteFromFavorite.click();
        btnConfirmDelete.click();
        return this;
    }

    public AccountPage(WebDriver driver) {
        super(driver);
    }
}
