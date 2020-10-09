package model;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
        this.setType("Manager");
    }

    @Override
    public void raiseSalary(double percentage) {
        super.raiseSalary(percentage + 1);
    }

    @Override
    public String toString() {
        return String.format("Manager | %s | Department: %s", super.toString(), department);
    }
}
