package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeCalculationTest {

    @Test
    public void testCalculateTime() {
        double result = TimeCalculation.calculateTime(100.0, 100.0);
        assertEquals(1.0, result, "100.0 / 100.0 should be 1.0");
    }

    @Test
    public void testCalculateTimeWithZero() {
        double result = TimeCalculation.calculateTime(0.0, 100.0);
        assertEquals(0.0, result, "0.0 / 100.0 should be 0.0");
    }

    @Test
    public void testCalculateTimeWithNegative() {
        double result = TimeCalculation.calculateTime(-100.0, 100.0);
        assertEquals(-1.0, result, "-100.0 / 100.0 should be -1.0");
    }
}