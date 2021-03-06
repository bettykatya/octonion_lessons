package com.octonion.automation_lessons.realt;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
задача -
- найти объявления о продаже квартир
    -- с раздельным санузлом
    -- в заданном наседенном пункте,
- сохранить их в избранное (если их там нет)
- сохранить адреса в csv файл (отдельные столбцы - населенный пункт, улица, дом, квартира)
 */

/*
следующая задача - очистить избранное, очищать файл
 */
public class FavoritesTest extends BaseTest {

    private SearchPage searchPage;
    private SearchResultPage searchResultPage;
    private AccountPage accountPage;
    private String city = "Копище";
    private String toiletType = "раздельный";
    private String fileName = "addresses.csv";

    @BeforeClass
    public void login() {
        CommonSteps.login(mainPage);
        mainPage = CommonSteps.openMainPageByLogo(driver);
    }

    @Test
    public void searchCity() {
        searchPage = mainPage.clickSearch();
        searchPage.enterCityInput(city);
        searchPage.clickCityDropdownValue(city);
        searchResultPage = searchPage.submitForm();
    }

    @Test(dependsOnMethods = "searchCity", enabled = false)
    public void verifyAddToFileAndToFavorite() throws IOException {
        for (int i = 0; i < 1; i++) {
            List<AdvertisingBlock> advertisingBlockList = searchResultPage.getAdvertisingBlockList();
            for (int j = 0; j < advertisingBlockList.size(); j++) {
                AdvertisingDetailsPage advertisingDetailsPage = advertisingBlockList.get(j).clickTitle();

                ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
                driver.switchTo().window(tabs2.get(1));

                if (advertisingDetailsPage.getToiletType().equals(toiletType)) {
                    String str = advertisingDetailsPage.getCity() + "," + advertisingDetailsPage.getAddress() + "\n";
                    FileUtils.addLine(fileName, str);

                    if (advertisingDetailsPage.getAddToFavBtnText().equals("Добавить в избранное")) {
                        advertisingDetailsPage.clickAddToFavBtn();
                    }
                }

                driver.close();
                driver.switchTo().window(tabs2.get(0));
            }

            if (!isLastPage(i, searchResultPage.getPageNumber())) {
                searchPage.clickNextPageBtn();
            }
        }
    }

    @Test(dependsOnMethods = "searchCity")
    public void deleteFromFavorites() {
        accountPage = searchPage.clickFavoriteAdsBtn();
        int size = accountPage.getBtnDeleteFromFavorite().size();
        for (int i = 0; i < size; i++) {
            accountPage = accountPage.deleteFromFavorite();
        }
    }
}