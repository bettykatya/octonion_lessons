package com.octonion.automation_lessons.realt;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;
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
    public void verifySearch() {

        searchPage.enterCityInput(city);
        searchPage.clickCityDropdownValue(city);
        searchPage.submitForm();

        int pageNumber = (int) Math.ceil((double) searchPage.getSearchResultCounter() / SearchPage.RESULTS_PER_PAGE);
        int lastPageSize = searchPage.getSearchResultCounter() % SearchPage.RESULTS_PER_PAGE;

        assertCityInAdsOnAllPages(pageNumber, lastPageSize);
    }

    private void assertCityInAdsOnAllPages(int pageNumber, int lastPageSize) {
        for (int i = 0; i < pageNumber; i++) {
            List<Integer> fromToAdsNumber = searchPage.getFromToAdsNumber();
            int fromN = i * SearchPage.RESULTS_PER_PAGE + 1;
            int toN = (i + 1) * SearchPage.RESULTS_PER_PAGE;
            int toNLastPage = fromN + lastPageSize - 1;

            List<WebElement> locationList = searchPage.getLocation();
            assertCityInAds(locationList, city);

            if (!isLastPage(i, pageNumber)) {
                Assert.assertEquals(locationList.size(), SearchPage.RESULTS_PER_PAGE);
                Assert.assertEquals(fromToAdsNumber, Arrays.asList(fromN, toN));
                searchPage.clickNextPageBtn();
            } else {
                Assert.assertEquals(locationList.size(), lastPageSize);
                Assert.assertEquals(fromToAdsNumber, Arrays.asList(fromN, toNLastPage));
            }
        }
    }

    private void assertCityInAds(List<WebElement> locationList, String city) {
        SoftAssert softAssert = new SoftAssert();
        for (int j = 0; j < locationList.size(); j++) {
            WebElement location = locationList.get(j);
            softAssert.assertTrue(location.getText().contains(city), "city was expected " + city + ", but address was " + location.getText());
        }
        softAssert.assertAll();
    }

    private boolean isLastPage(int i, int totalPageNumber) {
        return i == totalPageNumber - 1;
    }
}
