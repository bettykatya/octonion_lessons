package com.octonion.automation_lessons.realt;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvertisingDetailsPage extends BasePage {

    @FindBy(xpath = "//td[contains(text(),'Сан/узел')]/following-sibling::td")
    private WebElement toiletType;

    public AdvertisingDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getToiletType() {
        try {
            return toiletType.getText();
        } catch (NoSuchElementException e){
            return "NONE";
        }
    }
}
