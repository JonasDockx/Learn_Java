// Test code lives under src/test/java — mirrors the main folder
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test                                   // marks this method as a test
    void addsTwoNumbers() {
        assertEquals(5, calc.add(2, 3));    // expected 5, actual calc.add(2,3)
    }

    @Test
    void subtractsTwoNumbers() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    void multipliesTwoNumbers() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void dividesTwoNumbers() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    void divideByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
    }
}
