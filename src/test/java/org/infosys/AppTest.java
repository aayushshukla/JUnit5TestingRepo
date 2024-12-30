package org.infosys;


import org.junit.jupiter.api.*;


/**
 * Unit test for simple App.
 */
// By default for each test case there will be different instances
// if i have n test cases than n instances of test class will created
// all instances creation will handled by Junit5
// all test cases run parallelly
public class AppTest
{
    CalculatorUtils cu;
    @BeforeAll // for beforeall method should static
    // because beforeall will be run  even before instance creation
  static void beforeAllInit()
    {
        System.out.println("Before all is executed");
    }

    @BeforeEach // it will execute before each of test .It is part of junit test lifecycle
     void init()
     {
         System.out.println("--Before every test it will execute---");
          cu = new CalculatorUtils();
     }
    @AfterEach
     void cleanupCode()
     {
         System.out.println("Cleaning code removing unused objects...");
     }
    @Test // teshshow is test method
    // we use @Test annotation to make a method as test method
     void testShow(){
         System.out.println("hello");
     }

     @Test
     @DisplayName("Add Method Test")
    void testAdd( )
     {

        // CalculatorUtils cu = new CalculatorUtils();
         int actual= cu.add(10,20);
         int expected=30;
         Assertions.assertEquals(actual,expected,"No equals");

     }

     @Test
     @Disabled //this will not be executed .This test will be skipped
    void testFail()
     {

         Assertions.fail("This test is always going to failed");
     }

    @Test
    @DisplayName("Null String Test")
    void testNullString()
    {
       // CalculatorUtils cu = new CalculatorUtils();
        String input="1234";
        String res =cu.parseString(input);
        Assertions.assertNotNull(res);
    }

    @Test
    @DisplayName("Comparing two objects")
    void testCompareObjects()
    {
        // String pool
        // Heap
        String s1="Hi";
        String s2="Hi";
        String s3= new String("Hi");
        Assertions.assertSame(s1,s2);
    }

    @Test
    void testDivException()
    {
      //  CalculatorUtils cu = new CalculatorUtils();
//        Assertions.assertThrows(ArithmeticException.class,
//                ()->cu.div(10,0));
        Assertions.assertDoesNotThrow(
                ()->cu.div(10,2)," exception in code"
                );
    }
    @AfterAll
    @Disabled
    static  void afterAllTests()
    {
        System.out.println("After all test. All test execution is done");
    }

    @Test
    @DisplayName("AssertAll in multiple test")

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
    @RepeatedTest(3)
    @Order(2)
    void myTest(RepetitionInfo repetitionInfo)
    {
        System.out.println(repetitionInfo.getCurrentRepetition());
        Assertions.assertEquals("hi","hi");
    }

}
