package test;

import automation.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("setUp");
    }

    @BeforeMethod
    public void setUp2() {
        System.out.println("setUp2");
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

    @AfterMethod
    public void tearDown() {
        System.out.println("tearDown");
    }






}
