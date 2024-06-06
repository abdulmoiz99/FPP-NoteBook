package Lesson5.Reflection;

import java.lang.reflect.*;
import java.util.Arrays;

class Phonedirectory {
    private String name;
    private String town;
    public int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Phonedirectory(String name, String town, int number) {
        this.name = name;
        this.town = town;
        this.number = number;
    }

    public Phonedirectory(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Phonedirectory(int number) {
        this.number = number;
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException, InstantiationException {

        // Obtain the class object if we know the name of the class
        Class obj = Phonedirectory.class;
        System.out.println("Class Name is: " + obj.getName());
        System.out.println("Class Name without package is: " + obj.getSimpleName());
        System.out.println("Package Name is: " + obj.getPackageName());

        Constructor[] constructors = obj.getDeclaredConstructors();
        System.out.println("Constructors are: " + Arrays.toString(constructors));


        Method[] methods = obj.getDeclaredMethods();

        for(Method m: methods)
        {
            System.out.println("method = " + m.getName());
        }
    }
}
