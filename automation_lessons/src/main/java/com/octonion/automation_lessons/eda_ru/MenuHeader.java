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
    private final String MENU_ITEM_FORMAT= "//*[@class='navigation-bar__link' and contains(text(),'%s')]";
    private SelenideElement receiptMenu = $x(String.format(MENU_ITEM_FORMAT, "Рецепты"));
    private SelenideElement journalMenu = $x(String.format(MENU_ITEM_FORMAT,"Журнал «ЕДА»"));
    private SelenideElement menu = $x(String.format(MENU_ITEM_FORMAT,"ШКОЛА «ЕДЫ»"));
    private SelenideElement menu = $x(String.format(MENU_ITEM_FORMAT,"Идеи"));
    private SelenideElement menu = $x(String.format(MENU_ITEM_FORMAT,"Авторы"));
    private SelenideElement menu = $x(String.format(MENU_ITEM_FORMAT,"База"));

}
