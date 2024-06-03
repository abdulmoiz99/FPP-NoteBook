package Leasson5.Inheritance.StaffProblem;

public class Professor extends Staff {
    int numOfPublications;

    public Professor() {
        System.out.println("Professor ctor is called");
    }
    public int getNumOfPublications() {
        return numOfPublications;
    }

    @Override
    public double computeSalary() {
        System.out.println("Professor is called!");
        return 2;
    }
}
