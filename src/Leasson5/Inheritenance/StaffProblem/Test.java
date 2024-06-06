package Leasson5.Inheritenance.StaffProblem;

public class Test {
    public static void main(String[] args) {
        StaffPerson professor = new Professor();
        StaffPerson secretary = new Secretary();

        System.out.println(professor.CalculateSalary());
        System.out.println(secretary.CalculateSalary());

        if(professor instanceof Professor){
            System.out.println("Yes");
        }
    }
}
