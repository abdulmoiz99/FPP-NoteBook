package Leasson5.InnerClass.SortWithMemeberClass;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class PersonDataStatic {
    static class NameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    public static NameComparator getNameComparator() {
        return new NameComparator();
    }
    public static void main(String[] args) {
        Person[] persons = prepareData();
        Arrays.sort(persons, PersonDataStatic.getNameComparator());
        System.out.println(Arrays.toString(persons));

    }
    static Person[] prepareData() {
        return new Person[]{
                new Person("Abdul"),
                new Person("Moiz"),
                new Person("Bilal"),

        };
    }
}
