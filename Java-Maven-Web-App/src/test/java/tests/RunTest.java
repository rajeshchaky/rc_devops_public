package tests;

import factory.Calculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunTest {


    @Test
    public void test_JUnit() {
        Assertions.assertEquals("This is the 1st testcase in this class", Calculation.returnString1());
    }

    @Test
    public void test_JUnit2() {
        Assertions.assertEquals("This is the 2nd testcase in this class", Calculation.returnString2());
    }
}
