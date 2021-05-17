package lec1;

public class Human implements Eatable, Sleepable {
    static int count;
    static {
        count= 0;
    }
    final int age;
    int tool;
    int weight;

    public Human() {
        super();
        age=10;
    }

    final void birthday() {
        //++age;
        Integer integer = 123;
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;

        int arr1[] = new int[]{1,2,3,4,5,6};
        //arr.length;

        int[][] arr2 = new int [5][3];

        int a= arr2[3][1];
    }


    @Override
    public void eat() {
        weight++;
    }

    @Override
    public void sleep() {
        System.out.println("I want sleep");
    }

}
