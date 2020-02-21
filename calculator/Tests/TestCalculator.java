package calculator.Tests;

import calculator.Classes.SimpleCalc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCalculator {
    @Test
    public void test()
    {
        SimpleCalc tester = new SimpleCalc();

        int sum = tester.add(1, 2);
        assertEquals(sum, 1 + 2);

        sum = tester.add(-4, 5);
        assertEquals(sum, -4 + 5);

        float d = tester.divide(10, 3);
        assertEquals(d, 10 / 3.0, 0.000002);

        d = tester.divide(7, 9);
        assertEquals(d, 7 / 9.0f, 0.000002);

        assertThrows(RuntimeException.class, () -> {
            tester.divide(2, 0);
        });
    }
}