package lec2;

import java.util.*;

public class Task2 {

    private static final Random RANDOM = new Random();

    public static void findWholeSquareNumbers(int[] numbers) {
        for (int k : numbers) {
            if (k < 0) {
                throw new IllegalStateException("k must be positive: " + k);
            }

            double q = Math.sqrt(k);
            int c = (int) q;
            if (c * c == k) {
                System.out.println(k);
            }
        }
    }

    static int[] generateArray(int length, boolean includeNegative) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = RANDOM.nextInt(100) - (includeNegative ? 50 : 0);
        }
        return numbers;
    }

}

