package com.example.lab1.service;

import com.example.lab1.entity.Car;
import com.example.lab1.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> listCar() {
        List<Car> list = carRepository.findAll();
        return list;
    }
}
