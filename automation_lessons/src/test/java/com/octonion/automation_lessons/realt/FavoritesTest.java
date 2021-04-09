package com.octonion.automation_lessons.realt;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileOutputStream;
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
следующая задача - очистить избранное
 */
public class FavoritesTest extends BaseTest {

    private SearchPage searchPage;
    private SearchResultPage searchResultPage;
    private String city = "Копище";
    private AdvertisingBlock advertisingBlock;
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

    //todo add screenshots
    @Test(dependsOnMethods = "searchCity")
    public void name() throws IOException {

        //todo all pages
        List<AdvertisingBlock> advertisingBlockList = searchResultPage.getAdvertisingBlockList();
        for (int i = 0; i < advertisingBlockList.size(); i++) {
            advertisingBlock = advertisingBlockList.get(i);
            advertisingBlock.clickTitle();

            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));

            AdvertisingDetailsPage advertisingDetailsPage = new AdvertisingDetailsPage(driver);
            System.out.println(" --- " + i + " - " + advertisingDetailsPage.getToiletType());

            //отдельные столбцы - населенный пункт, улица, дом, квартира
            String str = advertisingDetailsPage.getCity() + "," + advertisingDetailsPage.getAddress() + "\n";

            //todo write to csv file
            FileOutputStream outputStream = new FileOutputStream(fileName, true);
            byte[] strToBytes = str.getBytes();
            outputStream.write(strToBytes);
            outputStream.close();


            driver.close();
            driver.switchTo().window(tabs2.get(0));
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
