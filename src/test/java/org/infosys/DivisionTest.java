package org.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    void testDivException()
    {
         CalculatorUtils cu = new CalculatorUtils();
        Assertions.assertDoesNotThrow(
                ()->cu.div(10,2)," exception in code"
        );
    }
}
