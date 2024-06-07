package Leasson5.InnerClass.SortWithMemeberClass;

import java.util.Arrays;
import java.util.Comparator;

public class PersonData {
    private class NameComparator1 implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    private NameComparator1 getNameComparator1() {
        return new NameComparator1();
    }

    public static void main(String[] args) {
        Person[] persons = perpareData();
        PersonData pd = new PersonData();
        Arrays.sort(persons, pd.getNameComparator1());
        System.out.println(Arrays.toString(persons));
    }

    public
    static Person[] perpareData() {
        return new Person[]{
                new Person("Abdul"),
                new Person("Moiz"),
                new Person("Bilal"),

        };
    }
}
