package Defining_Classes.Google;

public class Company {
    //companyName, salary, department
    private String companyName;
    private String department;
    private double salary;

    public Company(String companyName, String department, double salary) {
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
            return String.format("%s %s %.2f", companyName, department, salary);
    }
}
