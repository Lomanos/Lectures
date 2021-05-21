package lec2.task3;

import lombok.*;

@Value
public class Person {

    private int age;

    private Sex sex;

    private String name;

    public Person(int age, boolean man, String name) {
        if (age < 0) {
            throw new IllegalArgumentException("age must be positive");
        }
        if (age > 100) {
            throw new IllegalArgumentException("age must be below 100");
        }

        this.age = age;
        this.sex = (man ? Sex.MAN : Sex.WOMAN);
        this.name = name;
    }

}
