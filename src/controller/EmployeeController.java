package controller;

import dto.MinimumSalary;
import dto.SeniorEmployee;
import model.Employee;
import service.EmployeeLocalService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeController {
    private final EmployeeLocalService service = new EmployeeLocalService();

    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    public void deleteEmployeeByName(String name) {
        System.out.printf("Usuário %s deletado com sucesso", name);
        service.deleteEmployeeByName(name);
    }

    public void increaseSalaryForAllEmployees(double percent) {
        service.increaseSalaryForAllEmployees(percent);
    }

    public Map<String, List<Employee>> groupEmployeeByRole() {
        return service.groupEmployeesByRole(
                service.getAllEmployees()
        );
    }

    public List<Employee> filterByDateRange(int... months) {
        return service.filterByBirthMonths(months);
    }

    public SeniorEmployee getSeniorEmployee() {
        return service.getSeniorEmployee();
    }

    public List<Employee> getAllEmployeesInAlphabeticOrder() {
        return service.sortEmployeesInAlphabeticOrder();
    }

    public BigDecimal getTotalSalary() {
        return service.calculateTotalSalary();
    }

    public Set<MinimumSalary> calculateMinimumSalary() {
        return service.calculateMinimumSalaries();
    }

}
