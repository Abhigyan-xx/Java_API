package com.example.Car.Repository;

import com.example.Car.Model.*;
import org.springframework.data.mongodb.repository.*;

import java.util.*;

public interface evCarRepository extends MongoRepository<evCar, String > {

    List<evCar> getByMake(String make);
  List<evCar> findByMakeStartingWith(String make);
    List<evCar> getByType (String type);
    List<evCar> getByRange(Integer range);
}
