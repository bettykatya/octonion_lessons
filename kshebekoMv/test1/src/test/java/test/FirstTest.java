package test;

import automation.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

    @Test(groups = "positive")
    public void positiveTest() {
        System.out.println("positive test");
    }

    @Test(groups = {"broken", "positive"})
    public void brokenPositiveTest() {
        System.out.println("positiveBrokenTest");
    }

    @Test(groups = "negative")
    public void negativeTest() {
        System.out.println("negativeTest");
    }

    @Test(priority = 2)
    public void test1() {
        System.out.println("test1");}

    @Test(enabled = false)
    public void test2() {
        System.out.println("enableTest2");}

    public void notTest() {
        System.out.println("not.Test");}

    @Test(priority = 1)
    private void test() {
        System.out.println("privateTest");
    }







}
