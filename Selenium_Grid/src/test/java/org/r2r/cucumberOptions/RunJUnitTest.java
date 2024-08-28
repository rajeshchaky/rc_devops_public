package org.r2r.cucumberOptions;

import org.junit.jupiter.api.Assertions;
import org.r2r.factories.Calculation;
import org.junit.jupiter.api.Test;

public class RunJUnitTest {


    @Test
    public void testFindMax1(){
        Assertions.assertEquals(4, Calculation.findMax1(new int[]{1,3,4,2}));
        //change the method in the below calculation.findmax2 method to findMax1 & you can re-create a junit failure*
        Assertions.assertEquals(-1, Calculation.findMax2(new int[]{-12,-1,-3,-4,-2}));

    }

    @Test
    public void testFindMax2(){
        Assertions.assertEquals(4, Calculation.findMax2(new int[]{1,3,4,2}));
        Assertions.assertEquals(-1, Calculation.findMax2(new int[]{-12,-1,-3,-4,-2}));
    }
}
