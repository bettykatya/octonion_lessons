package test;

import automation.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class SecondTest {

    private Calculator calculator;

    @BeforeClass
    public void createCalc() {
        calculator = new Calculator();
    }

    @Test
    public void degree() {
        System.out.println("2 in degree 2");
        Assert.assertEquals(calculator.degree(2,2),4, "2 in degree 2 = 4");
    }

    @Test
    public void negativeDegree() {
        System.out.println("2 in degree 5");
        Assert.assertEquals(calculator.degree(2, 5), 30, "2 in degree 5 = 32");
    }

    @Test
    public void sqrt() {
        System.out.println("sqrt 4 = 2");
        Assert.assertEquals(Math.sqrt(4), 2);
    }

    @Test
    public void rint() {
        System.out.println("2.3 nearer 2");
        Assert.assertEquals(Math.rint(2.3),3);
    }

   @AfterMethod
    public void tearDown() {
        System.out.println("tearDown");
   }

   @DataProvider (name = "test")
    public Object[][] createData() {
        return new Object[][]{
                {2, 2, 4},
                {2, 5, 30},
                {2, 3, 8}
        };
   }

    @Test (dataProvider = "test")
    public void degreePositiveDataProvider(int a, int b, int res) {
        Assert.assertEquals(calculator.degree(a, b), res);
    }

    //Soft Assert
    @Test
    public void softAssert() {
    Assert.assertEquals(Math.sqrt(4), 2);

    SoftAssert softAssert = new SoftAssert();
    softAssert.assertTrue(4 == 4);
    softAssert.assertTrue(4 / 2 == 2);
    softAssert.assertAll();

    }



}