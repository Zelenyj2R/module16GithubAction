package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new Calculator();
    }

    @Test
    void sumOne() {
        assertEquals(1, sumCalculator.sum(1));
    }
    @Test
    void sumThree() {
        assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    void sumZero() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
