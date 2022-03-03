package com.example.poc.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

import static java.util.Arrays.asList;

@Data
@AllArgsConstructor
public class Person {

    private String nome;
    private int idade;
    private double salario;

    public static List<Person> bancoDePessoas() {
        return asList(
                new Person("Lemoel Marques", 42, 10000),
                new Person("Josiane Marques", 38, 8000),
                new Person("Daniel Marques", 15, 8200),
                new Person("Rebeca Marques", 9, 7000),
                new Person("Pedro Marques", 20, 1200),
                new Person("Isaias Marques", 20, 1300)
        );
    }

}
