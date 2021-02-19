package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest extends BaseTest {

    private SearchPage searchPage;
    private String city = "Минск";

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
        List<WebElement> locationList = searchPage.getLocation();
        Assert.assertEquals(locationList.size() , 30);

        //todo monday - use soft assert
        //todo monday - use factory or dataprovider
        for (int i = 0; i < locationList.size(); i++) {
            WebElement location = locationList.get(i);
            Assert.assertTrue(location.getText().contains(city));
        }
    }

    /*
    todo
    открыть каждое объявление, там проверить город в заголовке
    (+ проверить Копище)
    (+ несколько страниц с результатами поиска)
     */
}
