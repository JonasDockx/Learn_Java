// Test code lives under src/test/java — mirrors the main folder
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test                                   // marks this method as a test
    void addsTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));    // expected 5, actual calc.add(2,3)
    }

    @Test
    void subtractsTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    void multiplyTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void dividesTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    void divideByZeroThrows() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
    }
}
