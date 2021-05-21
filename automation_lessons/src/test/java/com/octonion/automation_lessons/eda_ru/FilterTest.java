package com.octonion.automation_lessons.eda_ru;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class FilterTest {

    public MenuHeader menuHeader;

    @BeforeClass
    public void userCanLoginByUsername() {
        open("https://eda.ru/");
        menuHeader = new MenuHeader();
    }

    @Test
    public void verifyExpandFilter() throws InterruptedException {
        menuHeader.clickFilterPanel();
        Thread.sleep(3000);
        menuHeader.expandFilterPanel();
        Thread.sleep(5000);
    }

    //todo add ScreenShorts





}
