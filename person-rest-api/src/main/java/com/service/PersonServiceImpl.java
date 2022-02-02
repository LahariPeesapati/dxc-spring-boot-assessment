package com.service;

import com.dxc.model.Person;
import com.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements Personservice {
    
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person getPersonById(int id) {
          return personRepository.findById(id).orElseThrow();
    
        
    }
    @Override
    public Person getPersonByEmail(String email) {
        return null;
    }
    @Override
    public Person getPersonByAddress(String address) {
        return null;
    }

}
