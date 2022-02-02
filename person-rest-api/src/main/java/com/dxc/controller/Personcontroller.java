package com.dxc.controller;

import java.util.List;
import java.util.Map;

import com.dxc.model.Person;
import com.repository.PersonRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Personcontroller {
    private final PersonRepository repository;
    Personcontroller(PersonRepository repository) {
        this.repository = repository;


    }
    @GetMapping("/persons")
    List<Person> all() {
        return repository.findAll();

    }
    @PostMapping("/persons")
    Person newPerson(@RequestBody Person newPerson) {
        return repository.save(newPerson);
    }
    @GetMapping("/persons/{id}")
    Person one(@PathVariable Integer id){
        return repository.findById(id)
        .orElseThrow(() -> new PersonNotFoundException(id));
    }
    @PutMapping("/persons/{id}")
    Person replacePerson(@RequestBody Person newPerson, @PathVariable Integer id) {
        .map(person -> {
            person.setName(newPerson.getName());
            person.setEmail(newPerson.getEmail());
            person.setAddress(newPerson.getAddress());
            person.setCreationDate(LocalDate.now());
            return repository.save(newPerson);

        });
    }

    @DeleteMapping("/persons/{id}")
    void deletePerson(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}

        
        
        


       
        
    
    