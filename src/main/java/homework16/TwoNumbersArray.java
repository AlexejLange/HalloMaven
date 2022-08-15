package homework16;

import java.util.stream.IntStream;

public class TwoNumbersArray {

    public boolean checkArray(int[] array, int firstNumber, int secondNumber) {
        boolean checkAnotherNumber = IntStream.of(array)
                .filter(i -> i != firstNumber)
                .filter(i -> i != secondNumber)
                .count() != 0;
        boolean checkFirstNumber = IntStream.of(array)
                .filter(i -> i == firstNumber)
                .count() != 0;
        boolean checkSecondNumber = IntStream.of(array)
                .filter(i -> i == secondNumber)
                .count() != 0;
        return !checkAnotherNumber && checkFirstNumber && checkSecondNumber;
    }
}
