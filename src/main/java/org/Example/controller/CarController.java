package org.Example.controller;


import org.Example.model.Car;
import org.Example.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    public List<Car> getAllCars(){
        return carService.getAllCars();
    }
}
