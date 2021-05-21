package com.octonion.automation_lessons.eda_ru;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MenuHeader {
    private SelenideElement logo = $(".top-line__logo");
    private final String MENU_ITEM_FORMAT = "//*[@class='navigation-bar__link' and contains(text(),'%s')]";
    private SelenideElement receiptMenu = $x(String.format(MENU_ITEM_FORMAT, "Рецепты"));
    private SelenideElement journalMenu = $x(String.format(MENU_ITEM_FORMAT, "Журнал «ЕДА»"));
    private SelenideElement schoolMenu = $x(String.format(MENU_ITEM_FORMAT, "ШКОЛА «ЕДЫ»"));
    private SelenideElement ideasMenu = $x(String.format(MENU_ITEM_FORMAT, "Идеи"));
    private SelenideElement authorsMenu = $x(String.format(MENU_ITEM_FORMAT, "Авторы"));
    private SelenideElement baseMenu = $x(String.format(MENU_ITEM_FORMAT, "База"));

    private SelenideElement searchField = $(".search-bar__name.js-to-search-state");
    private SelenideElement receiptBookField = $(".user-bar__link.user-bar__link_bookmark");
    private SelenideElement filterReceiptPanel = $(".top-line-filter__toggle-text");
    private SelenideElement expandedFilterReceiptPanel = $(".tag-selector__main-list");

    public void expandFilterPanel() {
        if (expandedFilterReceiptPanel.isDisplayed()){
            System.out.println("Block expanded");
            //todo $element ask Kate
        } else {
            filterReceiptPanel.click();
        }
    }
    public void clickFilterPanel(){
        filterReceiptPanel.click();
    }
}


// #TODO: 5/18/2021
// - Menu header (+ expandeble filter, search)
//        - Footer
//        - Table of content footer
//        - Homepage
//        - Receipt Listing
//        - Receipt items block
//        - Receipt Details
//        - Login popup
//        - Profile (add/remove receipt)

