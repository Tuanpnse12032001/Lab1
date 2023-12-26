package com.example.lab1.controller;

import com.example.lab1.entity.Car;
import com.example.lab1.service.CarService;
import com.example.lab1.service.CarServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car_data")
@AllArgsConstructor
public class CarController {

    private final CarService carService;

//    public CarController(CarService carService) {
//        this.carService = carService;
//    }

    @GetMapping("/get_data")
    public ResponseEntity<List<Car>> getData() {
        List<Car> list = carService.listCar();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/get_data2")
    public ResponseEntity<List<Car>> getData2() {
        List<Car> list = carService.listCar();
        return ResponseEntity.ok(list);
    }

}
