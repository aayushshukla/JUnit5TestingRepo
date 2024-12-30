package org.infosys;

import org.junit.jupiter.api.*;
// we are creating one instance for class : modify default functionality
//default is for every test/method there will be different instances
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ChangeDefaultInstanceTest {
    @BeforeAll
    public  void beforeAll()
    {
        System.out.println("Before All executes");
    }
  @BeforeEach
    public  void init()
    {
        System.out.println("Before each executes");
    }
   @AfterEach
    public  void cleaning()
    {
        System.out.println("After each executes");
    }
 @AfterAll
    public  void freeResources()
    {
        System.out.println("After all executes");
    }

    @Test
    void mytest()
    {
        Assertions.assertTrue(5>4);
    }


}
