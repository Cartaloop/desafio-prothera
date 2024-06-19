package model;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public abstract class Person {
    private String nome;
    private LocalDate birthDate;

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Person(String nome, String birthDate) {
        this.nome = nome;
        try{
            this.birthDate = LocalDate.parse(birthDate, dateFormat);
        }
        catch(DateTimeParseException e){
            System.out.println("Error parsing date: " + e.getMessage());
        }

    }
    public String getNome() {
        return nome;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
}
