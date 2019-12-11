package com.example.pet.demo.controller;

import com.example.pet.demo.model.Person;
import com.example.pet.demo.model.Pet;
import com.example.pet.demo.repostories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PetController {

    @Autowired
    PetRepository petRepository;

    @GetMapping("/pets")
    public Iterable<Pet> getPersons(){
        Iterable<Pet> personArrayList = petRepository.findAll();
        return personArrayList;
    }

    @GetMapping("/pets/{id}")
    public Pet getPet(@PathVariable Integer id){
        Optional<Pet> petOptional = petRepository.findById(id);

        return petOptional.get();
    }

    @PostMapping("/pets")
    public void addPet(Pet pet){
        petRepository.save(pet);
    }
}
