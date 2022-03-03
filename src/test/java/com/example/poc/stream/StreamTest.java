package com.example.poc.stream;

import com.example.poc.stream.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
public class StreamTest {

    @Test
    public void antesDoStream() {
        List<Person> people = Person.bancoDePessoas();

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        List<String> theFirstThree = new ArrayList<>();

        for (Person person : people) {
            if (person.getIdade() < 25) {
                theFirstThree.add(person.getNome());
                if (theFirstThree.size() >= 3) {
                    break;
                }
            }
        }

        System.out.println(theFirstThree);

    }

    @Test
    public void comStream() {

        List<Person> people = Person.bancoDePessoas();

        List<String> menorQueVinteCinco = people
                .stream()
                .filter(p -> p.getIdade() < 25)
                .sorted(Comparator.comparing(Person::getNome))
                .limit(3)
                .map(Person::getNome)
                .collect(Collectors.toList());

        System.out.println(menorQueVinteCinco);

        List<String> meno = people
                .stream()
                .sorted(Comparator.comparing(Person::getIdade))
                .map(Person::getNome)
                .collect(Collectors.toList());

        System.out.println(meno);

        var stringOrdenadoReverse = meno
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        var ordenadoPorNome  = people
                .stream()
                .sorted(Comparator.comparing(Person::getNome))
                .collect(Collectors.toList());

        var ordenadoPelaIdade = people
                .stream()
                .sorted(Comparator.comparing(Person::getIdade))
                .collect(Collectors.toList());

        var ordenadoPeloSalario = people
                .stream()
                .sorted(Comparator.comparing(Person::getSalario))
                .collect(Collectors.toList());

    }

}
