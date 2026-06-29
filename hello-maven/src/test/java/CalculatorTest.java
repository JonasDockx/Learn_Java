// Test code lives under src/test/java — mirrors the main folder
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test                                   // marks this method as a test
    void addsTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));    // expected 5, actual calc.add(2,3)
    }
}
