package lec2;

public class Task1 {

    public static void npe() {
        String str = null;
        System.out.println("" + str.length());
    }

    public static void aioobe() {
        int[] m = new int[0];
        System.out.println(m[1]);
    }

    public static void myThrow() {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException q) {
            throw new RuntimeException("something goes wrong", q);
        }

    }

}
