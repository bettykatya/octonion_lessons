package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends BasePage {

    @FindBy(css = ".listing-item[data-mode]")
    private List<WebElement> adRoots;

    private List<AdvertisingBlock> advertisingBlockList = new ArrayList<>();

    public SearchResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

        for (int i = 0; i < adRoots.size(); i++) {
            AdvertisingBlock advertisingBlock = new AdvertisingBlock(driver, adRoots.get(i));
            advertisingBlockList.add(advertisingBlock);
            System.out.println("--- " + advertisingBlock.getTitle());
        }

    }

    public List<AdvertisingBlock> getAdvertisingBlockList() {
        return advertisingBlockList;
    }
}
