package Leasson5.Inheritenance.StaffProblem;

public class Professor extends StaffPerson {
    private int numberOfPublication;

    public int getNumberOfPublication() {
        return numberOfPublication;
    }

    @Override
    public double CalculateSalary(){
        return 10;
    }
}
