package service;

import database.MemoryDatabase;
import model.Employee;
import model.Person;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class EmployeeLocalService {
    private final MemoryDatabase memoryDatabase;

    public EmployeeLocalService(MemoryDatabase memoryDatabase) {
        this.memoryDatabase = memoryDatabase;
    }

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
}
