package database;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class MemoryDatabase {
    private List<Person> persons;

    public MemoryDatabase() {
        persons = new ArrayList<>();
    }

}
