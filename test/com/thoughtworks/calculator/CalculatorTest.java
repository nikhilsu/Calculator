package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void shouldReturnTheNumberSuppliedWithTheAddCommandInitially() {
        Calculator calculator = new Calculator(0.0);

        assertEquals(5.0, calculator.add(5.0), 0.0);
    }

}