package test;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Hamcrest {

    @Test
    public void test1() {
        String string = "Katy";
        assertThat(string, equalTo("Katy"));
    }

    @Test
    public void test2() {
        Integer intNum = 7;
        assertThat(intNum, allOf(greaterThan(5), lessThanOrEqualTo(7), not(equalTo(6))));
    }

    @Test
    public void stringRegister() {
        String a = "Katy";
        String b = "katy";
        assertThat(a,equalToIgnoringCase(b));
    }

    @Test
    public void doubleNum() {
        Double doubleNum = 5.50005;
        assertThat(doubleNum, closeTo(5.5, 0.005));
    }

    @Test
    public void listCheckNotEmpty() {
        List<Integer> list = Arrays.asList(3, 5, 7);
        assertThat(list, is(not(empty())));
    }

    @Test
    public void listCheckSize() {
        List<Integer> list = Arrays.asList(3,4,5);
        assertThat(list, hasSize(3));
    }

    @Test
    public void listContains() {
        List<Integer> list = Arrays.asList(3, 4, 5);
        assertThat(list, contains(3, 4, 5));
    }
}
