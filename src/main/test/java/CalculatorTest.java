import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void calculate() {
        String result = Calculator.calculate("10", "5");
        String expected = "Sum: 15.0, Subtract: 5.0, Divide: 2.0, Product: 50.0";
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }

    @Test
    void calculate2() {
        String result = Calculator.calculate("20", "2");
        String expected = "Sum: 22.0, Subtract: 18.0, Divide: 10.0, Product: 40.0";
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }

}
