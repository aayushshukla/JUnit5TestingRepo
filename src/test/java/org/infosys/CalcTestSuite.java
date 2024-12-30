package org.infosys;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({AdditionTest.class,DivisionTest.class})
public class CalcTestSuite {

}
