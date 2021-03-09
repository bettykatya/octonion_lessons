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

        int pageNumber = (int) Math.ceil((double) searchPage.getSearchResultCounter() / SearchPage.RESULTS_PER_PAGE);
        System.out.println(" --- pageNumber " + pageNumber);

        int lastPageSize = searchPage.getSearchResultCounter() % SearchPage.RESULTS_PER_PAGE;
        System.out.println(" --- lastPageSize " + lastPageSize);

        for (int i = 0; i < pageNumber; i++) {

            // todo проверяем шапку
            //1-30, 31-60, 61-90 ...   +30

            List<WebElement> locationList = searchPage.getLocation();

            //Assert.assertEquals(locationList.size(), 30); //todo fix for last page

            if (i == pageNumber - 1) {
                Assert.assertEquals(locationList.size(), lastPageSize);
            } else {
                Assert.assertEquals(locationList.size(), SearchPage.RESULTS_PER_PAGE);
            }

            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(locationList.size(),30);
            for (int j = 0; j < locationList.size(); j++) {
                WebElement location = locationList.get(j);
                softAssert.assertTrue(location.getText().contains(city), "city was expected " + city + ", but address was " + location.getText());
            }
            softAssert.assertAll();

            searchPage.clickNextPageBtn(); // после теста не находит кнопку на последней странице Assert

            if (i != pageNumber - 1) {
                searchPage.clickNextPageBtn();
            }

            //todo check new page is opened
        }
    }
}
