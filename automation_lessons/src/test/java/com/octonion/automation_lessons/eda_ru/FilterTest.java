package com.octonion.automation_lessons.eda_ru;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Date;

import static com.codeborne.selenide.Selenide.open;

public class FilterTest {

    public MenuHeader menuHeader;

    @BeforeClass
    public void userCanLoginByUsername() {
        Configuration.reportsFolder = "test-result/reports";
        Configuration.startMaximized = true;
        ScreenShooter.captureSuccessfulTests = true;
        open("https://eda.ru/");
        menuHeader = new MenuHeader();
    }

    @AfterMethod
public void takeScreenshot(){
        Selenide.screenshot(String.valueOf(new Date().getTime()));
    }

    @Test
    public void verifyExpandFilter(){
        menuHeader.clickFilterPanel();
        doSleep(3);
        menuHeader.expandFilterPanel();
        doSleep(5);
    }
    private void doSleep(int sec){
        try {
            Thread.sleep(sec*1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }



}
