package Leasson5.Inheritance.StaffProblem;

public class DriverClass {
    public static void main(String[] args) {
        Staff professor = new Professor();
        Staff secretary = new Secretary();

        // professor.getNumOfPublications(); // cannot access it because the parent object is of Staff
    }
}
