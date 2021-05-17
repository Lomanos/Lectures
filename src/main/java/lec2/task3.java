package lec2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Person[] Persons = generate(10000);

 //       Persons[0]= new Person(10, true, "M10");
//        Persons[1]= new Person(10, true, "M10");

        Sort1 sort1 = new Sort1();
        Sort2 sort2 = new Sort2();

        Person[] Persons1 = Arrays.copyOf(Persons, Persons.length);
        Person[] Persons2 = Arrays.copyOf(Persons, Persons.length);

        long start = System.currentTimeMillis();
        sort1.sort(Persons1);
        long finish = System.currentTimeMillis();
        System.out.println("sort1: "+(finish-start));

        start = System.currentTimeMillis();
        sort2.sort(Persons2);
        finish = System.currentTimeMillis();
        System.out.println("sort2: "+(finish-start));

    }

    public static Person[] generate(int count) {
        Random random = new Random();
        Person[] persons = new Person[count];
        for (int i = 0; i < count; i++) {
            int a= random.nextInt(100);
            boolean m= random.nextBoolean();
            String n= (m?"M":"W")+a;
            persons[i]= new Person(a, m, n);
        }
        return persons;
    }

    static class Person {
        int age;
        Sex sex;
        String name;

        Person(int age, boolean man, String name) {
            if(age<0) {
                throw new IllegalArgumentException("age must be positive");
            };
            if(age>100) {
                throw new IllegalArgumentException("age must be below 100");
            };

            this.age= age;
            this.sex= (man?Sex.MAN:Sex.WOMAN);
            this.name= name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", sex=" + sex +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    enum Sex {
        MAN, WOMAN;
    }

    interface Sorter {
        Person[] sort(Person[] arr);
    }

    static class PersonComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            int result=o1.sex.compareTo(o2.sex);
            if (result != 0) {
                return result;
            };
            result= -Integer.compare(o1.age, o2.age);
            if (result != 0) {
                return result;
            }
            result= o1.name.compareTo(o2.name);
            return result;
        }
    }

    static class Sort1 implements Sorter {
        @Override
        public Person[] sort(Person[] arr) {
            PersonComparator personComparator = new PersonComparator();
            if(arr.length==1){
                return arr;
            }
            boolean equals = false;
            while (equals!=true) {
                equals= true;
                for (int i = arr.length-1; i > 0; i--) {

                    if(arr[i].name==arr[i-1].name
                            && arr[i].age==arr[i-1].age){
                        throw new IllegalArgumentException("duplicate person: "+arr[i].name+" "+arr[i].age);
                    }

                    int result= personComparator.compare(arr[i],arr[i-1]);
                    if(result==-1){
                        Person v= arr[i];
                        arr[i]  = arr[i-1];
                        arr[i-1]= v;
                        equals = false;
                    }
                }
            };
            return arr;
        }
    }

    static class Sort2 implements Sorter {
        @Override
        public Person[] sort(Person[] arr) {
            Arrays.sort(arr,new PersonComparator());
            return arr;
        }
