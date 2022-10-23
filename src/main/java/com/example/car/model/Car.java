package com.example.car.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Car {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String brand, model, color, registerNumber;
private int year, price;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "owner")
private Owner owner;
}