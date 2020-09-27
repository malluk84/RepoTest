package calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    final Calculator calc = new Calculator();

    @Test
    void sumTest() {
        Assertions.assertEquals(4, calc.sum(2, 2));
    }
    @Test
    void rozTest() {
        Assertions.assertEquals(0, calc.roz(2, 2));
    }
    @Test
    void mnozTest() {
        Assertions.assertEquals(4, calc.mnoz(2, 2));
    }
    @Test
    void dzielTest() {
        Assertions.assertEquals(1, calc.dziel(2, 2));

    }


}



