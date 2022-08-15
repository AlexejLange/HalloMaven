package homework16;

import java.util.stream.IntStream;

public class ArrayProcessing {

    public int[] resultArray(int[] array, int number) {

        int index = IntStream.range(0, array.length)
                .map(i -> array.length - i - 1)
                .filter(i -> array[i] == number)
                .findFirst().orElseThrow(() -> new RuntimeException("The array must contain number 4!"));

        int[] result = new int[array.length - index - 1];
        System.arraycopy(array, index + 1, result, 0, array.length - index - 1);
        return result;
    }
}