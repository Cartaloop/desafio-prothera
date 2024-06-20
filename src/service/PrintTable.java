package service;

import model.Employee;

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

    public void printTable(List<Employee> employees) {
        template(employees);
    }

    public void printTable(String birthDateStart, String birthDateEnd) {
        template(service.filterByBirthDateRange(birthDateStart, birthDateEnd));
    }

    public void printTableGroupedByRole() {
        Map<String, List<Employee>> groupedByRole = service.groupEmployeesByRole(service.getAllEmployees());
        template(groupedByRole);

    }

    public void printTableSeniorEmployee() {
        Employee senior = service.getSeniorEmployee();
        int age = service.calculateSeniorAge();
        template(age, senior);
    }

    private void template (List<Employee> condition) {
        System.out.printf("%-20s %-30s %-15s %-15s\n", "Nome", "Data Nascimento ", "Salário", "Função");
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
        System.out.println("Ordenação por Função");
        System.out.printf("%-20s %-30s %-15s %-15s\n", "Nome", "Data Nascimento", "Salário", "Função");
        System.out.println("--------------------------------------------------------------------------------");

        groupedByRole.forEach((role, empList) -> empList.forEach(employee -> System.out.printf("%-20s %-30s %-15s %-15s\n",
                employee.getName(),
                dateFormater.format(employee.getBirthDate()),
                employee.getSalary(),
                employee.getRole())));
    }

    private void template(int age, Employee senior){
        System.out.println("Busca por funcionário mais velho");
        System.out.printf("%-20s %-20s\n", "Nome", "Idade");
        System.out.println("--------------------------");

        System.out.printf("%-20s %-30s\n",
                senior.getName(),
                (age + " anos"));
    }


}
