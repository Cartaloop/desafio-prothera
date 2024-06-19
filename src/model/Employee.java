package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee extends Person {
    private BigDecimal salary;
    private String role;

    public Employee(String nome, String birthDate, BigDecimal salary, String role) {
        super(nome, birthDate);
        this.salary = salary;
        this.role = role;
    }


}
