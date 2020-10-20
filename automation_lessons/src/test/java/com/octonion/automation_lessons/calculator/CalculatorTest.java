package com.octonion.automation_lessons.calculator;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void createCalc() {
        calculator = new Calculator();
    }

    @Test
    public void sumPositiveInt() {
        System.out.println("testing sum of 2 and 4");
        Assert.assertEquals(calculator.sum(2, 4), 6, "sum of 2 and 4 for should be equal to 6");
    }

    @Test
    public void sumPositiveDouble() {
        System.out.println("testing sum of 2 and 4");
        Assert.assertEquals(calculator.sum(2.4, 4.2), 6.6, "sum of 2.4 and 4.2for should be equal to 6.6");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod");
    }

    //region DataProviderr
    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                {2, 4, 6},
                {6, 8, 14},
                {6, 8, 15}
        };
    }

    @Test(dataProvider = "test1")
    public void sumPositiveDataProvider(int a, int b, int res) {
        Assert.assertEquals(calculator.sum(a, b), res);
    }
    //endregion

    //region SoftAssert
    @Test
    public void testSoftAssert() {
        Assert.assertEquals(calculator.sum(2, 2), 4);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(2 == 2);
        softAssert.assertTrue(2 * 2 == 4);
        softAssert.assertAll();
    }
    //endregion
}
