package homework16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTwoNumbersArray {
    TwoNumbersArray twoNumbersArray;

    @BeforeEach
    public void init() {
        twoNumbersArray = new TwoNumbersArray();
    }

    @Test
    public void testCheckArray1() {
        int[] array = {1, 1, 1, 4, 4, 1, 4, 4};
        boolean result = twoNumbersArray.checkArray(array, 1, 4);
        Assertions.assertTrue(result);
    }

    @Test
    public void testCheckArray2() {
        int[] array = {1, 1, 1, 1, 1, 1, 1};
        boolean result = twoNumbersArray.checkArray(array, 1, 4);
        Assertions.assertFalse(result);
    }

    @Test
    public void testCheckArray3() {
        int[] array = {4, 4, 4, 4, 4, 4, 4, 4};
        boolean result = twoNumbersArray.checkArray(array, 1, 4);
        Assertions.assertFalse(result);
    }

    @Test
    public void testCheckArray4() {
        int[] array = {1, 1, 1, 4, 4, 1, 4, 3};
        boolean result = twoNumbersArray.checkArray(array, 1, 4);
        Assertions.assertFalse(result);
    }
}
