package calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    final Calculator calc = new Calculator();

    @Test
    void addTest() {
        Assertions.assertEquals(4, calc.add(2, 2));
    }
    @Test
    void subTest() {
        Assertions.assertEquals(0, calc.sub(2, 2));
    }
    @Test
    void multiTest() {
        Assertions.assertEquals(4, calc.multi(2, 2));
    }
    @Test
    void divisionTest() {
        Assertions.assertEquals(1, calc.division(2, 2));

    }
    @Test
    void arithmeticExceptionIsThrownWhenTriesToDevidedByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> { calc.division(2,0);
        });
    }


}



