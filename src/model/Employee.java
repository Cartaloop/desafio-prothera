package model;

import java.math.BigDecimal;

public class Employee extends Person {
    private BigDecimal salary;
    private final String role;

    public Employee(String nome, String birthDate, BigDecimal salary, String role) {
        super(nome, birthDate);
        this.salary = salary;
        this.role = role;
    }

    public BigDecimal getSalary() {
        return salary;
    }
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

}
