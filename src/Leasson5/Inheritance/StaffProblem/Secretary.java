package Leasson5.Inheritance.StaffProblem;

public class Secretary extends Staff{

    public  Secretary()
    {
        System.out.println("Secretary ctor is called");
    }
    int numofYears;

    public int getNumofYears() {
        return numofYears;
    }

    @Override
    public double computeSalary() {
        System.out.println("Secretary is called!");
        return 1;
    }
}
