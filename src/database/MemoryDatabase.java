package database;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class MemoryDatabase {
    private final List<Person> persons;

    public MemoryDatabase() {
        persons = new ArrayList<>();
    }

    public String addPerson(Person person) {
        persons.add(person);
        return person.toString();
    }

    public List<Person> getPersons() {
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

        persons.removeIf(e -> e.getNome().contains(name));
    }

}
