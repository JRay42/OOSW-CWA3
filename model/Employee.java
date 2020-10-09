package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Employee {

    private ArrayList<Employee> people;
    private StringBuilder data;
    private String type;
    private String name;
    double salary;

    public Employee (String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.type = "Employee";
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary (double percentage) {
        salary += salary * percentage / 100;
    }

    public String getType() {
        return type;
    }

    public void setType(String s) {
        type = s;
    }

    public StringBuilder getData() {
        return data;
    }

    @Override
    public String toString() {
        return String.format("Employee | Name: %s | Salary: $%.2f", name, salary);
    }

    public void render(Graphics2D g2, int i) {
        g2.setColor(Color.YELLOW);
        g2.setFont(new Font("courier", Font.BOLD, 12));
        g2.drawString(this.toString(), 50, i * 50 + 50);
    }
}