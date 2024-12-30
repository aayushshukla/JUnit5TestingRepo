package org.infosys;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class SimpleAddTest {



    @ParameterizedTest
    @CsvSource({"10,20 ,30",
            "3,4,7"})
    void add(int a , int b,int c)
    {
        int expected=30;
        int actual = a+b;
        Assertions.assertEquals(c,actual);
    }
}
