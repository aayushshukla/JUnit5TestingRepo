package org.infosys;

import org.junit.jupiter.api.*;

@DisplayName("Nesting testing running...")
public class NestedTestClassesDemo {
    CalculatorUtils cu;
    @BeforeEach
    void init()
    {
        cu = new CalculatorUtils();
    }

    @Nested  // nested test class
    class AdditionTest{

        @Test
        @DisplayName("Addition Test For Positive Values")
        void addTest_Positive()
        {
            int actual= cu.add(10,20);
            int expected=30;
            Assertions.assertEquals(actual,expected,"No equals");

        }

        @Test
        @DisplayName("Addition Test For Negative Values ")
        void addTest_Negative()
        {
            int actual= cu.add(-10,-20);
            int expected=-30;
            Assertions.assertEquals(actual,expected,"No equals");

        }

    }

  @Test
    void testMultiple()
    {
        //assertAll :it will true if all case true
        // it is similar to AND condition
        Assertions.assertAll(
                ()->Assertions.assertEquals(0,cu.multiple(0,4)),
                ()->Assertions.assertEquals(-2, cu.multiple(-2,1)),
                ()->Assertions.assertEquals(4, cu.multiple(4,1))

        );
    }
}
