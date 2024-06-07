package Leasson5.InnerClass.SortWithMemeberClass;

import java.util.Arrays;
import java.util.Comparator;

public class PersonDataAnonymousClass {
    public static void main(String[] args) {
        Person[] persons = prepareData();
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
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
