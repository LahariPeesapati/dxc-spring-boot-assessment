package com.dxc.controller;

public class PersonNotFoundException extends RuntimeException {
    PersonNotFoundException(Integer id) {
        super("Could not find Book " + id);
    
    
}
}
