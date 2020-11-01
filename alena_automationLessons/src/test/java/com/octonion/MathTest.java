package com.octonion;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MathTest {

    public Math math;


    @Test
    public void testSoftAssert() {
        Assert.assertEquals(Math.sqrt(4), 2);
    }

    @Test
    public void testSoftAssert2() {
        Assert.assertEquals(Math.sqrt(6), 1);
    }

    @DataProvider(name = "testWithDataProvider")
    public Object[][] createData1() {
        return new Object[][]{
                {2, 2, 4},
                {1, 1, 1},
                {3, 2, 9}
        };
    }


    @Test(dataProvider = "testWithDataProvider")
    public void checkPowerOfNumber(int a, int b, int res) {
        Assert.assertEquals(Math.pow(a, b), res);
    }

    @AfterMethod
    public void checkPowerOfNumber() {
        System.out.println("Aftermethod");
    }


}
