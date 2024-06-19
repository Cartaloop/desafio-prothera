package model;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public abstract class Person {
    private final String name;
    private LocalDate birthDate;

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Person(String nome, String birthDate) {
        this.name = nome;

        try{
            this.birthDate = LocalDate.parse(birthDate, dateFormat);
        }
        catch(DateTimeParseException e){
            System.out.println("Error parsing date: " + e.getMessage());
        }

    }
    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate.format(dateFormat);
    }
}
