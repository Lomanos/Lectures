package lec2;

import java.util.Random;

public class task2 {
    public static void main(String[] args) {

        int[] num = generate(100,false);
        for (int i = 0; i < num.length; i++) {
            int k= num[i];

            if (k < 0) {
                throw new IllegalStateException("k must be positive: "+k);
            }

            double q = Math.sqrt(k);
            int c = (int) q;
            if(c*c == k) {
                System.out.println(k);
            }
        }
    }

    public static int[] generate(int n, boolean p) {

        int[] numbers = new int[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            numbers[i]= random.nextInt(100)-(p?0:50);
        }
        return numbers;
    }
}

