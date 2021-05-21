package lec2;

import org.junit.*;

public class Task2Test {

    @Test
    public void test_find_whole_square_numbers() {
        int[] numbers = Task2.generateArray(100, false);
        Task2.findWholeSquareNumbers(numbers);
    }

    @Test(expected = IllegalStateException.class)
    public void test_rise_exception_on_negative_number() {
        int[] numbers = Task2.generateArray(100, true);
        Task2.findWholeSquareNumbers(numbers);
    }

}
