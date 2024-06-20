package service;

import model.Employee;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static tools.StaticTools.*;

public class PrintTable {
    private final EmployeeLocalService service;

    public PrintTable(EmployeeLocalService service) {
        this.service = service;
    }



    public void printTable() {
        template(service.getAllEmployees());
    }

    public void printTable(String birthDateStart, String birthDateEnd) {
        template(service.filterByBirthDateRange(birthDateStart, birthDateEnd));
    }

    public void printTableGroupedByRole() {
        Map<String, List<Employee>> groupedByRole = service.groupEmployeesByRole(service.getAllEmployees());
        template(groupedByRole);

    }

    private void template (List<Employee> condition) {
        System.out.printf("%-20s %-30s %-15s %-15s\n", "Nome", "Data Nascimento ", "Salário", "Cargo");
        System.out.println("--------------------------------------------------------------------------------");

        for (Employee person : condition) {
            System.out.printf("%-20s %-30s %-15s %-15s\n",
                    person.getName(),
                    dateFormater.format(person.getBirthDate()),
                    decimalFormater.format(person.getSalary()),
                    person.getRole());

        }
    }

    private void template(Map<String, List<Employee>> groupedByRole) {
        System.out.printf("%-20s %-30s %-15s %-15s\n", "Nome", "Data Nascimento", "Salário", "Cargo");
        System.out.println("--------------------------------------------------------------------------------");

        groupedByRole.forEach((role, empList) -> {
            empList.forEach(employee -> {
                System.out.printf("%-20s %-30s %-15s %-15s\n",
                        employee.getName(),
                        employee.getBirthDate(), // Supondo que getBirthDate retorna uma string formatada
                        employee.getSalary(),
                        employee.getRole());
            });
        });
    }


}
