package model;

import java.util.ArrayList;

public class CompanyPersonnel {
    public static final ArrayList<Employee> database = new ArrayList<>();

    static {
        database.add(new President("Felicity", 500000, "Felicidad Inc."));
        database.add(new Executive("Darius", 150000, "Opperations EVP"));
        database.add(new Executive("Desiree", 130000, "Staff EVP"));
        database.add(new Manager("Fernando", 112000, "Sales"));
        database.add(new Manager("Elaine", 98000, "IT"));
        database.add(new Manager("Eugene", 76000, "HR"));
        database.add(new Employee("Aaron", 41000));
        database.add(new Employee("Ariel", 47000));
        database.add(new Employee("Bradley", 72000));
        database.add(new Employee("Bianca", 67000));
        database.add(new Employee("Charles", 53000));
        database.add(new Employee("Chrity", 49000));
    }
}
