package com.service;

import java.util.List;

import com.dxc.model.Person;



public interface Personservice {

    public Person getPersonById(int id);
    public Person getPersonByName(String name);
    public Person getPersonByEmail(String email);
    public Person getPersonByAddress(String address);
    public Person createPerson(Person person);
    public Person updatePerson(Person person);
    public void deletePerson(int id);

    public List<Person> getAllPersons();


    
}
