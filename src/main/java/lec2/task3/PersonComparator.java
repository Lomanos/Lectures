package lec2.task3;

import java.util.*;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result;
        result = o1.getSex().compareTo(o2.getSex());
        if (result != 0) {
            return result;
        }

        result = -1 * Integer.compare(o1.getAge(), o2.getAge());
        if (result != 0) {
            return result;
        }
        result = o1.getName().compareTo(o2.getName());
        return result;
    }

}
