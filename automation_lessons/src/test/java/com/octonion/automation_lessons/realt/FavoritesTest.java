package com.octonion.automation_lessons.realt;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
задача -
- найти объявления о продаже квартир
    -- с раздельным санузлом
    -- в заданном наседенном пункте,
- сохранить их в избранное (если их там нет)
- сохранить адреса в csv файл (отдельные столбцы - населенный пункт, улица, дом, квартира)
 */

public class FavoritesTest extends BaseTest {

    private SearchPage searchPage;
    private SearchResultPage searchResultPage;
    private String city = "Копище";
    private AdvertisingBlock advertisingBlock;

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

    @Test(dependsOnMethods = "searchCity")
    public void name() {

        for (int i = 0; i < searchResultPage.getAdvertisingBlockList().size(); i++) {

//            advertisingBlock = new AdvertisingBlock(driver);
//            advertisingBlock.clickTitle();
        }



    }
    
    /*
    precondition - user logged in
    1 - open main mage
    2 - search city
    3 - open every ad and
        - check restroom
        - check favorite
     */
}
