package lec2.task3;

import java.util.*;

public class Sort2 implements Sorter {

    @Override
    public Person[] sort(Person[] arr) {
        Arrays.sort(arr, new PersonComparator());
        return arr;
    }

}
