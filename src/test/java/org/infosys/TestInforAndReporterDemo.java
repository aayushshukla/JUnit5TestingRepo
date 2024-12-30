package org.infosys;

import org.junit.jupiter.api.*;
// TestInfo and test reporters are interfaces
@DisplayName("Test Reporter and infor demo")
public class TestInforAndReporterDemo {
    TestInfo testInfo;
    TestReporter testReporter;
    CalculatorUtils cu;
    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        this.testInfo=testInfo;
        this.testReporter=testReporter;
        cu= new CalculatorUtils();
        testReporter.publishEntry("Test class running \t"+testInfo.getTestClass()
                +" \n test running \t "+testInfo.getTestMethod()
                +"\n tags \t "+testInfo.getTags()+
                "\n display name \t"+testInfo.getDisplayName()
        );
    }

    @Test
    @DisplayName("Testing add method")
    @Tag("Add")
    void addTest()
    {
//        System.out.println(this.testInfo.getTestClass());
//        System.out.println(this.testInfo.getTestMethod());
//        System.out.println(this.testInfo.getTags());
        int actual= cu.add(10,20);
        int expected=30;
        Assertions.assertEquals(actual,expected,"No equals");




    }
    @Test
    @DisplayName("Testing Multiply Method")
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

    @Test
    void testDivException()
    {

        Assertions.assertDoesNotThrow(
                ()->cu.div(10,2)," exception in code"
        );
    }
}
