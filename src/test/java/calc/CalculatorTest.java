package calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    final Calculator calc = new Calculator();

    @Test
    void sumTest() {
        Assertions.assertEquals(4, calc.sum(2, 2));
    }
}
