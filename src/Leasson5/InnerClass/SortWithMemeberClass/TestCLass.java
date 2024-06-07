package Leasson5.InnerClass.SortWithMemeberClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestCLass {
    public static void main(String[] args) {
        Person[] persons =  perpareData();
        Arrays.sort(persons, new NameComparator());
        System.out.println(Arrays.toString(persons));
    }
    static Person[] perpareData()
    {
        return new Person[] {
                new Person("Abdul"),
                new Person("Moiz"),
                new Person("Bilal"),

        };
    }
}
