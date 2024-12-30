package org.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdditionTest {
    @Test
    @DisplayName("Add Method Test")
    void testAdd( )
    {

        CalculatorUtils cu = new CalculatorUtils();
        int actual= cu.add(10,20);
        int expected=30;
        Assertions.assertEquals(actual,expected,"No equals");

    }

}
