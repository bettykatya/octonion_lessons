package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SearchTestDataprovider extends BaseTest {

    private SearchPage searchPage;
    private String city = "Минск";

    @DataProvider
    public Object[][] cities(){
        return new Object[][] {
                {"Брест"},
                {"Минск"},
                {"Гродно"}
        };
    }

    @Test(dataProvider = "cities")
    public void verifyOpenSearchPage(String city) throws InterruptedException {

        driver.navigate().to("https://realt.by/");
        mainPage = new MainPage(driver);

        searchPage = mainPage.clickSearch();
        Assert.assertTrue(searchPage.getFilterForm().isDisplayed());

        Thread.sleep(3000); //todo change to wait

        searchPage.enterCityInput(city);
        searchPage.clickCityDropdownValue(city);
        searchPage.submitForm();

        Thread.sleep(10000); //todo change to wait
        List<WebElement> locationList = searchPage.getLocation();
        Assert.assertEquals(locationList.size() , 30);

        SoftAssert softAssert = new SoftAssert();
        //todo monday - use factory or dataprovider
        for (int i = 0; i < locationList.size(); i++) {
            WebElement location = locationList.get(i);
            softAssert.assertTrue(location.getText().contains(city), "city was expected " + city + ", but address was " + location.getText());
        }
        softAssert.assertAll();
    }

    /*
    todo
    открыть каждое объявление, там проверить город в заголовке
    (+ проверить Копище)
    (+ несколько страниц с результатами поиска)
     */
}