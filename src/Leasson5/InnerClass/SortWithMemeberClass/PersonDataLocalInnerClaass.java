package Leasson5.InnerClass.SortWithMemeberClass;

import java.util.Arrays;
import java.util.Comparator;

public class PersonDataLocalInnerClaass {
    public static void main(String[] args) {
        Person[] persons = prepareData();
        PersonDataLocalInnerClaass pd = new PersonDataLocalInnerClaass();
        pd.Sort(persons);
        System.out.println(Arrays.toString(persons));
    }

    public void Sort(Person[] persons) {
        class NameComparator implements Comparator<Person> {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }
        Arrays.sort(persons, new NameComparator());
    }

    static Person[] prepareData() {
        return new Person[]{
                new Person("Abdul"),
                new Person("Moiz"),
                new Person("Bilal"),

        };
    }
}
