package Leasson5.InnerClass.SortWithMemeberClass;

import java.util.Arrays;

public class PersonDataLamdaExpress {
    public static void main(String[] args) {
        Person[] person = prepareData();
        Arrays.sort(person, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(Arrays.toString(person));
    }
    static Person[] prepareData() {
        return new Person[]{
                new Person("Abdul"),
                new Person("Moiz"),
                new Person("Bilal"),

        };
    }
}
