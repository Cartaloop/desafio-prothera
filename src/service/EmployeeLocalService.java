package service;

import database.MemoryDatabase;
import model.Employee;
import model.Person;

import java.util.List;

public class EmployeeLocalRepository {
    private final MemoryDatabase memoryDatabase;

    public EmployeeLocalRepository(MemoryDatabase memoryDatabase) {
        this.memoryDatabase = memoryDatabase;
    }

    public void addEmployee(Employee employee) {
        memoryDatabase.addPerson(employee);
    }

    public List<Person> getAllEmployees() {
        return memoryDatabase.getPersons();
    }

    public void deleteEmployeeByName(String name) {
        memoryDatabase.removePersonByName(name);
        System.out.println("Deleted employee with name " + name);
        System.out.println(memoryDatabase.getPersons());
    }
}
