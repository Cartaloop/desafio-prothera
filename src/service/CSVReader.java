package service;

import model.Employee;
import model.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    List<Person> personList = new ArrayList<>();

    public List<Person> readObjects(String csvFileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFileName));

            String line = "";
            while((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[0];
                String birthDate = data[1];
                BigDecimal salary = BigDecimal.valueOf(Double.parseDouble(data[2]));
                String role = data[3];

                Person person = new Employee(name, birthDate, salary, role);
                personList.add(person);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return personList;
    }

}
