package com.octonion.automation_lessons.realt;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvertisingBlock extends BasePage {

    private WebElement root;
    private WebElement titleLink;

    public AdvertisingBlock(WebDriver driver, WebElement root) {
        super(driver);
        this.root = root;
        this.titleLink = root.findElement(By.cssSelector(".listing-item  a.teaser-title"));
    }

    public AdvertisingDetailsPage clickTitle() {
        titleLink.click();
        return new AdvertisingDetailsPage(driver);
    }

    public String getTitle() {
        return titleLink.getText();
    }
}
