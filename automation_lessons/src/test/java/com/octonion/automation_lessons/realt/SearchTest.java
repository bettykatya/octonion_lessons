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

        //todo round to greater instead of +1
        int pageNumber = searchPage.getSearchResultCounter() / SearchPage.RESULTS_PER_PAGE + 1;
        System.out.println(" --- pageNumber " + pageNumber);

        for (int i = 0; i < pageNumber; i++) {

            // todo проверяем шапку
            //1-30, 31-60, 61-90 ...   +30

            List<WebElement> locationList = searchPage.getLocation();
            Assert.assertEquals(locationList.size(), SearchPage.RESULTS_PER_PAGE); //todo fix for last page

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
}
