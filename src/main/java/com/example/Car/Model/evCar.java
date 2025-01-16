package com.example.Car.Model;


import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

@Document(collection = "newCar")
@Data
public class evCar {
    @Id
    private String id;
    private String state;
    private Integer year;
    private String make;  // Changed from 'Make' to 'make'
    private String type;
    private Integer range;
    private String eligibility;
    private String price;
}

