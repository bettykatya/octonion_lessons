package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends BasePage {

    public static final int RESULTS_PER_PAGE = 30;

    @FindBy(css = ".listing-item[data-mode]")
    private List<WebElement> adRoots;

    @FindBy(xpath = "//div[@class='mt-sm']/div/strong[1]")
    private WebElement searchResultCounter;

    private int pageNumber;
    private int lastPageSize;

    private List<AdvertisingBlock> advertisingBlockList = new ArrayList<>();

    public SearchResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

        for (int i = 0; i < adRoots.size(); i++) {
            AdvertisingBlock advertisingBlock = new AdvertisingBlock(driver, adRoots.get(i));
            advertisingBlockList.add(advertisingBlock);
            System.out.println("--- " + advertisingBlock.getTitle());
        }

        pageNumber = (int) Math.ceil((double) Integer.parseInt(searchResultCounter.getText()) / RESULTS_PER_PAGE);
        lastPageSize = Integer.parseInt(searchResultCounter.getText()) % RESULTS_PER_PAGE;
    }

    public List<AdvertisingBlock> getAdvertisingBlockList() {
        return advertisingBlockList;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getLastPageSize() {
        return lastPageSize;
    }


}
