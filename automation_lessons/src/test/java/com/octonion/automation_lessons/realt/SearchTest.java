package com.octonion.automation_lessons.realt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.octonion.automation_lessons.realt.SearchResultPage.RESULTS_PER_PAGE;

public class SearchTest extends BaseTest {

    private SearchPage searchPage;
    private String city = "Лида";

    @Test
    public void verifyOpenSearchPage() {
        searchPage = mainPage.clickSearch();
        Assert.assertTrue(searchPage.getFilterForm().isDisplayed());
    }

    @Test(dependsOnMethods = "verifyOpenSearchPage")
    public void verifySearch() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // Неявное ожидание

        searchPage.enterCityInput(city);
        searchPage.clickCityDropdownValue(city);
        SearchResultPage searchResultPage = searchPage.submitForm();


        WebDriverWait wait = new WebDriverWait(driver, 10); //Явное ожидание
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='mt-sm']/div/strong[1]")));

        int pageNumber = (int) Math.ceil((double) searchPage.getSearchResultCounter() / SearchPage.RESULTS_PER_PAGE);
        System.out.println(" --- pageNumber " + pageNumber);

        int pageNumber = searchResultPage.getPageNumber();
        int lastPageSize = searchResultPage.getLastPageSize();


        int lastPageSize = searchPage.getSearchResultCounter() % SearchPage.RESULTS_PER_PAGE;
        System.out.println(" --- lastPageSize " + lastPageSize);

        for (int i = 0; i < pageNumber; i++) {

            List<Integer> fromToAdsNumber = searchPage.getFromToAdsNumber();

            int fromN = i * SearchPage.RESULTS_PER_PAGE + 1;
            int toN = (i + 1) * SearchPage.RESULTS_PER_PAGE;
            int toNLastPage = fromN + lastPageSize - 1;

            if (i != pageNumber - 1) {
                int fromN = i * RESULTS_PER_PAGE + 1;
                int toN = (i + 1) * RESULTS_PER_PAGE;
                int toNLastPage = fromN + lastPageSize - 1;

                List<WebElement> locationList = searchPage.getLocation();
                assertCityInAds(locationList, city);

                if (!isLastPage(i, pageNumber)) {
                    Assert.assertEquals(locationList.size(), RESULTS_PER_PAGE);
                    Assert.assertEquals(fromToAdsNumber, Arrays.asList(fromN, toN));
                } else {
                    Assert.assertEquals(fromToAdsNumber, Arrays.asList(fromN, toNLastPage));
                }

                List<WebElement> locationList = searchPage.getLocation();

                if (i == pageNumber - 1) {
                    Assert.assertEquals(locationList.size(), lastPageSize);
                } else {
                    Assert.assertEquals(locationList.size(), SearchPage.RESULTS_PER_PAGE);
                }

                SoftAssert softAssert = new SoftAssert();
                for (int j = 0; j < locationList.size(); j++) {
                    WebElement location = locationList.get(j);
                    softAssert.assertTrue(location.getText().contains(city), "city was expected " + city + ", but address was " + location.getText());
                }
                softAssert.assertAll();

                if (i != pageNumber - 1) {
                    searchPage.clickNextPageBtn();
                }

            }
        }
    }
}



