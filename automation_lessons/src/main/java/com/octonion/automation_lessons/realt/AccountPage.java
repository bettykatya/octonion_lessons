package com.octonion.automation_lessons.realt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AccountPage extends BasePage {

    private final String CSS_BTN_DELETE_LIST = ".list-group-item";

    @FindBy(css = CSS_BTN_DELETE_LIST)
    private List<WebElement> btnDeleteFromFavorite;

    @FindBy(css = ".btn.btn-success[data-bb-handler='confirm']")
    private WebElement btnConfirmDelete;

    public AccountPage deleteFromFavorite() {
        int sizeBeforeDelete = btnDeleteFromFavorite.size();
        btnDeleteFromFavorite.get(0).click();
        btnConfirmDelete.click();

        new WebDriverWait(driver, 5).until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(CSS_BTN_DELETE_LIST), sizeBeforeDelete - 1));

        return new AccountPage(driver);
    }

    public List<WebElement> getBtnDeleteFromFavorite() {
        return btnDeleteFromFavorite;
    }

    public AccountPage(WebDriver driver) {
        super(driver);
    }
}
