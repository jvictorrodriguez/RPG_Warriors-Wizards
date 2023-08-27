package org.example.labs.lab_106;

public class Intern extends Employee{

    protected final double SALARY_LIMIT = 20_000;
    public Intern(String firstName, String lastName, double salary) {
        super(firstName, lastName, salary);
    }

    @Override
    public void setSalary(double salary) {
        salary = salary < SALARY_LIMIT ? salary : SALARY_LIMIT;
        super.setSalary(salary);

    }
}
