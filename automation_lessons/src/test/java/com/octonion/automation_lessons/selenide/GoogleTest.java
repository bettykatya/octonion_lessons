package com.octonion.automation_lessons.selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @Test
    public void verifySearch() {
        Configuration.startMaximized = true;
        open("https://www.google.com/");

        SelenideElement element = $("[name='q']");
        SelenideElement elementXpath = $x("//input[@name='t']");
        ElementsCollection elementsCollection = $$("[name='q']");

        element.sendKeys("selenide");
        element.sendKeys(Keys.ENTER);

        element.waitUntil(appears, 5);
        element.waitUntil(appear, 5);
        elementXpath.shouldBe(visible);

        WebDriver webDriver = WebDriverRunner.getWebDriver();
    }
}
