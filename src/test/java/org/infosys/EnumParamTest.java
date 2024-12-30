package org.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumParamTest {
    @ParameterizedTest
    @EnumSource(Days.class)
    void checkEnumValues(Days day)
    {
       // Assertions.assertNotNull(day);
        Assertions.assertEquals("sun",day.toString());
    }
}
