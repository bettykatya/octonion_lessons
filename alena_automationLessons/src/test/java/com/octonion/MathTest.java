package com.octonion;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class MathTest {

    @Test(groups = {"critical", "positive"})
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

    @Test(dependsOnMethods = "roundNumber1", groups = "round")
    public void roundNumber3() {
        System.out.println("roundNumber3");
        Assert.assertEquals(Math.round(2.533), 3, "2.533 = 3");
    }

    @Test(dependsOnMethods = "roundNumber2", alwaysRun = true, groups = "round")
    public void roundNumber1() {
        System.out.println("roundNumber1");
        Assert.assertEquals(Math.round(2.533), 3, "2.533 = 3");
    }

    @Test(groups = "round")
    public void roundNumber2() {
        System.out.println("roundNumber2");
        assertThat(Math.round(58.6), equalTo(3L));
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
