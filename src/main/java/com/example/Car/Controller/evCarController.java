package com.example.Car.Controller;

import com.example.Car.Model.*;
import com.example.Car.Repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class evCarController {

    @Autowired
    private evCarRepository evCarRepository;

    @GetMapping("/getallCar")

    public List<evCar> getallCar() {
        return evCarRepository.findAll();
    }

    @GetMapping("/getbyMake")
    public List<evCar> getByMake(@RequestParam String make) {
        if (make.length() >= 3) {
            return evCarRepository.findByMakeStartingWith(make);
        } else {
            throw new IllegalArgumentException("Make must be at least 3 characters long");
        }
    }

    @GetMapping("/getbyType")
    public List<evCar> getbyType(@RequestParam String type) {
        return evCarRepository.getByType(type);

    }

    @GetMapping("/getbyRange")
    public List<evCar> getbyRange(@RequestParam Integer range) {
        return evCarRepository.getByRange(range);
    }

    @PostMapping("/create")

    public Object evCar(@RequestBody evCar evCar) {
        return evCarRepository.save(evCar);
    }

}
