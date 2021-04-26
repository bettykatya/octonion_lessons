package com.octonion.automation_lessons.realt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountPage extends BasePage {

    @FindBy(css = ".list-group-item")
    private List<WebElement> btnDeleteFromFavorite;

    @FindBy(css=".btn.btn-success[data-bb-handler='confirm']")
    private WebElement btnConfirmDelete;

    public AccountPage deleteFromFavorite() {
        btnDeleteFromFavorite.get(0).click();
        btnConfirmDelete.click();

        return new AccountPage(driver);
    }

    public List<WebElement> getBtnDeleteFromFavorite() {
        return btnDeleteFromFavorite;
    }

    public AccountPage(WebDriver driver) {
        super(driver);
    }
}
