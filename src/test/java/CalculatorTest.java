import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void init(){
        calculator = new Calculator();
    }

    @CsvSource({
            "1, 1, 2",
            "2, 3, 5",
            "7, 5, 12"
    })

    @ParameterizedTest
    public void parameterizedTestAdd(int a, int b, int result) {
        Assertions.assertEquals(result, calculator.add(a, b));
    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void testSub() {
        Assertions.assertEquals(0, calculator.sub(2,2));
    }
}
