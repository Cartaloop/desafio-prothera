package service;

import database.MemoryDatabase;
import model.Employee;
import model.Person;
import tools.StaticTools;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static tools.StaticTools.dateFormater;
import static tools.StaticTools.decimalFormater;

public class EmployeeLocalService {
    private final MemoryDatabase memoryDatabase = new MemoryDatabase();


    public void addEmployee(Employee employee) {
        memoryDatabase.addPerson(employee);
    }

    public void addManyEmployees(int quantity) {
        Person[] persons = new Person[quantity];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < quantity; i++) {

            String name;
            String birthDate;
            BigDecimal salary;
            String role;

            System.out.println("Digite o nome da pessoa: ");
            name = scanner.next();
            System.out.println("Digite o aniversário da pessoa: ");
            birthDate = scanner.next();
            System.out.println("Digite o salario da pessoa: ");
            salary = scanner.nextBigDecimal();
            System.out.println("Digite a função da pessoa: ");
            role = scanner.next();

            Person employee = new Employee(name, birthDate, salary, role);
            persons[i] = employee;

        }
        scanner.close();
        for (int i = 0; i < quantity; i++) {
            memoryDatabase.addPerson((Employee) persons[i]);
        }
    }

    public List<Employee> getAllEmployees() {
        return memoryDatabase.getPersons();
    }

    public void deleteEmployeeByName(String name) {
        memoryDatabase.removePersonByName(name);
        System.out.println("Deleted employee with name " + name);
        System.out.println("\n\n\n");
    }

    public void increaseSalaryForAllEmployees(double percent) {
        memoryDatabase.increaseSalaryForAllEmployees(percent);
        System.out.println("Salary increased for: " + memoryDatabase.getPersons().size() + " employees.");
        System.out.println("\n\n\n");
    }

    public Map<String, List<Employee>> groupEmployeesByRole(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getRole));
    }


    public List<Employee> filterByBirthDateRange(String birthDateStrInit, String birthDateStrEnd) {
        LocalDate birthDateStart = LocalDate.parse(birthDateStrInit, dateFormater);
        LocalDate birthDateEnd = LocalDate.parse(birthDateStrEnd, dateFormater);
        return memoryDatabase.getPersons().stream()
                .filter(e -> {
                    LocalDate eBirthDate = e.getBirthDate();
                    return !eBirthDate.isBefore(birthDateStart) && !eBirthDate.isAfter(birthDateEnd);
                })
                .collect(Collectors.toList());
    }
}
