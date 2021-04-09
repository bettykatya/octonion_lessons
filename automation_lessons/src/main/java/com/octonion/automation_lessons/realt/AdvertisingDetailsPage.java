package com.octonion.automation_lessons.realt;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvertisingDetailsPage extends BasePage {

    @FindBy(xpath = "//td[contains(text(),'Сан/узел')]/following-sibling::td")
    private WebElement toiletType;

    @FindBy(xpath = "//td[contains(text(),'Населенный пункт')]/following-sibling::td")
    private WebElement city;

    @FindBy(xpath = "//td[contains(text(),'Адрес')]/following-sibling::td")
    private WebElement address;

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

    public String getCity() {
        try {
            return city.getText();
        } catch (NoSuchElementException e){
            return "NONE";
        }
    }

    public String getAddress() {
        try {
            return address.getText();
        } catch (NoSuchElementException e){
            return "NONE";
        }
    }
}
