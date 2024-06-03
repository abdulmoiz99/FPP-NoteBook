package Leasson5.Inheritance.StaffProblem;

public class Staff {
    public  Staff(){
        System.out.println("Staff ctor is called");
    }
    private String name;
    private String address;
    private String telNumber;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public double computeSalary() {
        System.out.println("Parent is called!");
        return 0.0;
    }
}
