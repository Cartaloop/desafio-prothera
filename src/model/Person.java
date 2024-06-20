package model;


import tools.StaticTools;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import static tools.StaticTools.dateFormater;

public abstract class Person {
    private final String name;
    private LocalDate birthDate;


    public Person(String nome, String birthDate) {
        this.name = nome;

        try{
            this.birthDate = LocalDate.parse(birthDate, dateFormater);
        }
        catch(DateTimeParseException e){
            System.out.println("Error parsing date: " + e.getMessage());
        }

    }
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }
}
