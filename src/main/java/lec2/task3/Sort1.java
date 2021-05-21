package lec2.task3;

public class Sort1 implements Sorter {

    private PersonComparator personComparator = new PersonComparator();

    @Override
    public Person[] sort(Person[] persons) {
        if (persons.length == 1) {
            return persons;
        }

        boolean equals = false;
        while (!equals) {
            equals = true;
            for (int i = persons.length - 1; i > 0; i--) {

//                if (persons[i].getName().equals(persons[i - 1].getName())
//                    && persons[i].getAge() == persons[i - 1].getAge()
//                ) {
//                    throw new IllegalArgumentException(String.format(
//                        "duplicate person: %s %s",
//                        persons[i].getName(),
//                        persons[i].getAge()
//                    ));
//                }

                int result = personComparator.compare(persons[i], persons[i - 1]);
                if (result < 0) {
                    Person v = persons[i];
                    persons[i] = persons[i - 1];
                    persons[i - 1] = v;
                    equals = false;
                }
            }
        }
        return persons;
    }

}
