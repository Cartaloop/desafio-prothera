package dto;

import java.math.BigDecimal;

public class MinimumSalary {
    private String name;
    private BigDecimal salary;

    public MinimumSalary(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;

    }
    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
