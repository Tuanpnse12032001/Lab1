package com.example.lab1.repository;

import com.example.lab1.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

    List<Car> findAllByBusNameAndId(String busName, Long id);
}
