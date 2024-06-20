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

    public void printTable(String birthDate) {
        template(service.filterByBirthDate(birthDate));
    }

    public void printTableGroupedByRole() {
        Map<String, List<Employee>> groupedByRole = service.groupEmployeesByRole(service.getAllEmployees());

        System.out.printf("%-20s %-30s %-15s %-15s\n", "Nome", "Data Nascimento", "Salário", "Cargo");
        System.out.println("--------------------------------------------------------------------------------");

        groupedByRole.forEach((role, empList) -> {
            empList.forEach(employee -> {
                System.out.printf("%-20s %-30s %-15s %-15s\n",
                        employee.getName(),
                        dateFormater.format(employee.getBirthDate()),
                        decimalFormater.format(employee.getSalary()),
                        employee.getRole());
            });
        });
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


}
