package com.octonion.automation_lessons.realt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    private SearchPage searchPage;

    @Test
    public void verifyOpenSearchPage() {
        searchPage = mainPage.clickSearch();
        Assert.assertTrue(searchPage.getFilterForm().isDisplayed());
    }

    @Test(dependsOnMethods = "verifyOpenSearchPage")
    public void verifySearch() throws InterruptedException {
        String city = "Минск";
        searchPage.enterCityInput(city);
        searchPage.clickCityDropdownValue();
        searchPage.submitForm();

        Thread.sleep(10000);

//        Assert.assertTrue(searchPage.getLocation().getText().contains(city));
    }

    /*
    todo
    открыть каждое объявление, там проверить город в заголовке
    (+ проверить Копище)
    (+ несколько страниц с результатами поиска)
     */
}
