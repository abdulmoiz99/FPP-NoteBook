package Leasson5.Inheritenance.StaffProblem;

public class Secretary extends StaffPerson {
    private int NumOfYears;

    public int getNumOfYears() {
        return NumOfYears;
    }

    @Override
    public double CalculateSalary() {
        return 20;
    }

}
