
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

class DeptEmployee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public DeptEmployee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    //default implementation
    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "name=" + name + ", salary=" + salary + ", hireDate=" + hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Professor extends DeptEmployee {

    public Professor(String name, double salary, LocalDate hireDate) {
        super(name, salary, hireDate);
    }
}

class Secretary extends DeptEmployee {
    private double netSalary;
    private double overtimeHours;

    public Secretary(String name, double salary, LocalDate hireDate, double overtimeHours) {
        super(name, salary, hireDate);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    //overrides superclass method
    public double getSalary() {
        netSalary = super.getSalary() + 12 * overtimeHours;
        return netSalary;
    }

    @Override
    public String toString() {
        return "name=" + super.getName() + ", salary=" + netSalary + ", hireDate=" + super.getHireDate();
    }
}

class DeptEmployeeData {

    public static DeptEmployee[] getDeptData() {
        Professor p0 = new Professor("Joe", 40000, LocalDate.of(1999, 12, 24));
        Professor p1 = new Professor("Bob", 50000, LocalDate.of(1979, 1, 2));
        Professor p2 = new Professor("Anna", 45000, LocalDate.of(2000, 5, 21));

        Secretary s0 = new Secretary("Joan", 50000, LocalDate.of(1987, 2, 15), 10);
        Secretary s1 = new Secretary("Janet", 40000, LocalDate.of(1995, 4, 22), 15);

        DeptEmployee[] department = {p0, p1, p2, s0, s1};
        return department;
    }
}

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] de = DeptEmployeeData.getDeptData();
        sortArray(de);

    }

    public static void sortArray(DeptEmployee[] de) {
        class NameComparator implements Comparator<DeptEmployee> {
            @Override
            public int compare(DeptEmployee d1, DeptEmployee d2) {
                return d1.getName().compareTo(d2.getName());
            }
        }


        Arrays.sort(de, new NameComparator());

        System.out.println(Arrays.toString(de));
    }
}
