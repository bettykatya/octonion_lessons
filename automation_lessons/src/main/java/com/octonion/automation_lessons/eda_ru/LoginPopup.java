package com.octonion.automation_lessons.eda_ru;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class LoginPopup {
    private SelenideElement emailInput = $("#login");
    private SelenideElement passwordInput = $("#password");
    private SelenideElement submitBtn = $("button[type=submit]");
}
