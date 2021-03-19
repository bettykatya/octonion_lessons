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
public class FavoritesTest extends LoginTest {


    @BeforeClass
    public void login() {
        //todo add common steps class with login method
    }

    @Test
    public void searchCity() {

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
