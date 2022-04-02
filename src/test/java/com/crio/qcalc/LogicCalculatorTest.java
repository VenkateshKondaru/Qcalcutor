
package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.crio.qcalc.business.LogicCalculator;

public class LogicCalculatorTest {

    private LogicCalculator logicCalculator;

    @BeforeEach
    void setup(){
        logicCalculator = new LogicCalculator();
    }


    @Test
    @DisplayName("Test AND of two Integers")
    void testANDOperation(){
        double expectedResult = 5;
        logicCalculator.AND(5,7);
        double actualResult = logicCalculator.getResult();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test OR of two Integers")
    void testOROperation(){
    	double expectedResult = 7;
    	logicCalculator.OR(5,7);
        double actualResult = logicCalculator.getResult();
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("Test XOR of two Integers")
    void testXOROperation(){
        double expectedResult = 3;
        logicCalculator.XOR(5,6);
        double actualResult = logicCalculator.getResult();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test NOT of given Integer")
    void testNOTOperation(){
        double expectedResult = -6;
        logicCalculator.NOT(5);
        double actualResult = logicCalculator.getResult();
        Assertions.assertEquals(expectedResult, actualResult);
    }


}

