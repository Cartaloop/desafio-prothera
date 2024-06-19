package model;

import java.time.LocalDate;

public abstract class Person {
    private String nome;
    private LocalDate birthDate;

    public Person(String nome, LocalDate birthDate) {
        this.nome = nome;
        this.birthDate = birthDate;
    }
    public String getNome() {
        return nome;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
}
