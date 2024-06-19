package database;

import model.Employee;
import service.CSVReader;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MemoryDatabase {
    private final List<Employee> persons;

    public MemoryDatabase() {
        persons = new ArrayList<>();
        CSVReader csvReader = new CSVReader();
        addPersons(csvReader.readObjects("/home/lucasrech/development/projects/desafio-prothera/src/resources/employees.csv"));
    }

    public void addPerson(Employee person) {
        persons.add(person);
    }

    public void addPersons(List<Employee> persons) {
        for (Employee person : persons) {
            addPerson(person);
        }
    }

    public List<Employee> getPersons() {
        if(persons.isEmpty()) {
            return new ArrayList<>();
        }
        return persons;
    }

    public void removePersonByName(String name) {
        if(persons.isEmpty()) {
            System.out.println("Persons list is empty");
        } else if (name.isEmpty()) {
            System.out.println("Person name is empty");
        }

        persons.removeIf(e -> e.getName().contains(name));
    }

    public void increaseSalaryForAllEmployees(Double percent) {
        for (Employee person : persons) {
            BigDecimal newSalary =  (person.getSalary().multiply(BigDecimal.valueOf(percent/100)).add(person.getSalary()));
            person.setSalary(newSalary);
        }
    }

}
