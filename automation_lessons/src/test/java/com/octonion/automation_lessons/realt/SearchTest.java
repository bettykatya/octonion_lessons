package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SearchTest extends BaseTest {

    private SearchPage searchPage;
    private String city = "Копище";

    @Test
    public void verifyOpenSearchPage() {
        searchPage = mainPage.clickSearch();
        Assert.assertTrue(searchPage.getFilterForm().isDisplayed());
    }

    @Test(dependsOnMethods = "verifyOpenSearchPage")
    public void verifySearch() throws InterruptedException {
        Thread.sleep(3000); //todo change to wait

        searchPage.enterCityInput(city);
        searchPage.clickCityDropdownValue(city);
        searchPage.submitForm();
        Thread.sleep(10000); //todo change to wait

        for (int i = 0; i < 3; i++) { //todo get number of pages
            List<WebElement> locationList = searchPage.getLocation();
            Assert.assertEquals(locationList.size(), 30);

            SoftAssert softAssert = new SoftAssert();
            for (int j = 0; j < locationList.size(); j++) {
                WebElement location = locationList.get(j);
                softAssert.assertTrue(location.getText().contains(city), "city was expected " + city + ", but address was " + location.getText());
            }
            softAssert.assertAll();
            searchPage.clickNextPageBtn();
            //todo check new page is opened
        }
    }

    //todo friday - check all pages in search result

    /*
    todo
    открыть каждое объявление, там проверить город в заголовке
    (+ проверить Копище)
    (+ несколько страниц с результатами поиска)
     */
}
