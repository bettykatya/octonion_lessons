package com.octonion;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class MathTest {




    @Test(groups = {"critical","positive"})
    public void testSoftAssert() {
        Assert.assertEquals(Math.sqrt(4), 1);
    }

    @Test(groups = "smoke")
    public void testSoftAssert2() {
        Assert.assertEquals(Math.sqrt(9), 3);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(3 == 2);
        softAssert.assertTrue(3 * 2 == 6);
        softAssert.assertAll();
    }

    @DataProvider(name = "testWithDataProvider")
    public Object[][] createData1() {
        return new Object[][]{
                {2, 2, 4},
                {1, 1, 1},
                {3, 2, 9}
        };
    }


    @Test(dataProvider = "testWithDataProvider", groups = "positiveChoices")
    public void checkPowerOfNumber(int a, int b, int res) {
        Assert.assertEquals(Math.pow(a, b), res);
    }

    @AfterMethod
    public void afterClassMethod() {
        System.out.println("After method");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }


}
