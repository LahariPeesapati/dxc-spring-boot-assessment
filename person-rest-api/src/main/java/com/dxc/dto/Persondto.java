package com.dxc.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persondto {
    private Integer id;
    private String name;
    private String address;
    private String email; 
    private LocalDate dob;  
    
}
