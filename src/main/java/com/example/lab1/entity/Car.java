package com.example.lab1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //annotation
@Table(name = "Bus")
@Getter
@Setter
@NoArgsConstructor

public class Car {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String busName;
}
