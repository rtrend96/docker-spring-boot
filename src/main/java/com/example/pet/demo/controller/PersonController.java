package com.example.pet.demo.controller;

import com.example.pet.demo.model.Person;
import com.example.pet.demo.repostories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @GetMapping("/persons")
    public Iterable<Person> getPersons(){
        Iterable<Person> personIterable = personRepository.findAll();
        return personIterable;
    }

    @GetMapping("/persons/{id}")
    public Person getPerson(@PathVariable Integer id){
        Optional<Person> person = personRepository.findById(id);

        return person.get();
    }
    @PostMapping("/persons")
    public void addPerson(Person person){
        personRepository.save(person);

    }

}
