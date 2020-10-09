package model;

public class Executive extends Manager {

    public Executive(String name, double salary, String department) {
        super(name, salary, department);
        this.setType("Executive");
    }

    @Override
    public void raiseSalary(double percentage) {
        super.raiseSalary(percentage + 2);
    }

    @Override
    public String toString() {
        return String.format("Executive | %s", super.toString());
    }
}
