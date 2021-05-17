package lec2.task3;

import java.util.*;

import org.junit.*;

public class Task3Test {

    private static final Random RANDOM = new Random();

    private static final Person[] PERSONS = generate(10000);

    @Test(expected = IllegalArgumentException.class)
    public void rise_exception_on_duplicate_person() {
        Sorter sorter = new Sort1();
        Person[] persons = new Person[]{
            new Person(10, true, "M10"),
            new Person(10, true, "M10")
        };
        sorter.sort(persons);
    }

    @Test
    public void test_sort_1() {
        Sorter sorter = new Sort1();

        Person[] persons = Arrays.copyOf(PERSONS, PERSONS.length);

        long start = System.currentTimeMillis();
        sorter.sort(persons);
        long finish = System.currentTimeMillis();

        System.out.println("sort1: " + (finish - start));
    }

    @Test
    public void test_sort_2() {
        Sorter sorter = new Sort2();

        Person[] persons = Arrays.copyOf(PERSONS, PERSONS.length);

        long start = System.currentTimeMillis();
        sorter.sort(persons);
        long finish = System.currentTimeMillis();

        System.out.println("sort2: " + (finish - start));
    }

    private static Person[] generate(int count) {
        Person[] persons = new Person[count];
        for (int i = 0; i < count; i++) {
            int age = RANDOM.nextInt(100);
            boolean sex = RANDOM.nextBoolean();
            String name = (sex ? "M" : "W") + age;
            persons[i] = new Person(age, sex, name);
        }
        return persons;
    }

}
