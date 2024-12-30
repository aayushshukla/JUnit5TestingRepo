package org.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CSVParamDemo {
    @ParameterizedTest
    @CsvSource({"10,20",
            "3,4"})
    void add(int a , int b)
    {
        int expected=30;
        int actual = a+b;
        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @CsvSource(value = {"10 ! 20",
            "30 ! 40"},
    delimiterString= "!")
    void add1(int a , int b)
    {
        int expected=70;
        int actual = a+b;
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvFileSource(
            files = "src/test/resources/testingfile.csv",
            numLinesToSkip = 1
    )
    void add2(int a , int b)
    {
        int expected=40;
        int actual = a+b;
        Assertions.assertEquals(expected,actual);
    }


}
