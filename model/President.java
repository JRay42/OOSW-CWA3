package model;

public class President extends Employee {
    private String company;

    public President(String name, double salary, String company) {
        super(name, salary);
        this.company = company;
        this.setType("President");
    }

    @Override
    public void raiseSalary(double percentage) {
        super.raiseSalary(percentage + 5);
    }

    @Override
    public String toString() {
        return String.format("President | %s | Company: %s", super.toString(), company);
    }
}
