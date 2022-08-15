package homework16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestArrayProcessing {
    ArrayProcessing arrayProcessing;

    @BeforeEach
    public void init() {
        arrayProcessing = new ArrayProcessing();
    }

    @Test
    public void testResultArray1() {
        int[] array = {1, 2, 2, 3, 1, 4, 1, 7};
        int[] trueResult = {1, 7};
        int[] result = arrayProcessing.resultArray(array, 4);
        Assertions.assertArrayEquals(result, trueResult);
    }

    @Test
    public void testResultArray2() {
        int[] array = {1, 4, 2, 3, 4, 1, 2, 1, 7};
        int[] trueResult = {1, 2, 1, 7};
        int[] result = arrayProcessing.resultArray(array, 4);
        Assertions.assertArrayEquals(result, trueResult);
    }

    @Test
    public void testResultArray3() {
        int[] array = {4, 4, 4, 4, 4, 4, 4, 4};
        int[] trueResult = {};
        int[] result = arrayProcessing.resultArray(array, 4);
        Assertions.assertArrayEquals(result, trueResult);
    }

    @Test
    public void testResultArray4() {
        int[] array = {1, 2, 2, 3, 1, 6, 1, 7};
        var exception = Assertions.assertThrows(RuntimeException.class, () ->
                arrayProcessing.resultArray(array, 4));
        Assertions.assertEquals("The array must contain number 4!", exception.getMessage());
    }
}
