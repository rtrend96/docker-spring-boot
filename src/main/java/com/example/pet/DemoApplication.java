package com.example.pet;

import com.example.pet.demo.model.Person;
import com.example.pet.demo.model.Pet;
import com.example.pet.demo.repostories.PersonRepository;
import com.example.pet.demo.repostories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

   /*@Component
    public class DemoData{
        @Autowired
        private final PetRepository petRepository;
        @Autowired
        private final PersonRepository personRepository;

        public DemoData(PetRepository petRepository, PersonRepository personRepository) {
            this.petRepository = petRepository;
            this.personRepository = personRepository;
        }

        @EventListener
        public void appReady(ApplicationReadyEvent event) {
            Pet pet1 = new Pet();
            pet1.setName("Pinky");
            pet1.setBirthDate(new Date());

            Pet pet2 = new Pet();
            pet2.setName("Pisika");
            pet2.setBirthDate(new Date());

            Pet pet3 = new Pet();
            pet3.setName("Pisika");
            pet3.setBirthDate(new Date());
            petRepository.save(pet1);
            petRepository.save(pet2);
            petRepository.save(pet3);

            Person person = new Person();
            person.setName("Soham");
            person.setSurname("Save");
            person.setCity("Thane");
            person.setAddress("123 Jersey City Apt Unknown");
            person.setPhone("1256782341");
            person.setPets(Arrays.asList(pet1,pet2));

            Person person2 = new Person();
            person.setName("Rushi");
            person.setSurname("Nage");
            person.setCity("Mumbai");
            person.setAddress("123 Mumbai City Apt Unknown");
            person.setPhone("12312314212");
            person.setPets(Arrays.asList(pet3));
            personRepository.save(person);
            personRepository.save(person2);
        }
    }*/
}
