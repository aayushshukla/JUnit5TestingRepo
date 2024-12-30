package org.infosys;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest2 {
    CalculatorUtils cu;
    @BeforeEach
        // it will execute before each of test .It is part of junit test lifecycle
    void init()
    {
        System.out.println("--Before every test it will execute---");
        cu = new CalculatorUtils();
    }

    @Order(value = 3)
    @Test
    void testAdd( )
    {

       // CalculatorUtils cu = new CalculatorUtils();
        int actual= cu.add(10,20);
        int expected=30;
        Assertions.assertEquals(actual,expected,"No equals");

    }

   @Order(value = 2)
    @Test
    void testNullString()
    {
       // CalculatorUtils cu = new CalculatorUtils();
        String input="1234";
        String res =cu.parseString(input);
        Assertions.assertNotNull(res);
    }

    @Order(value = 1)
    @Test
    void testAdd2( )
    {

        // CalculatorUtils cu = new CalculatorUtils();
        int actual= cu.add(10,20);
        int expected=30;
        Assertions.assertEquals(actual,expected,"No equals");

    }
}
