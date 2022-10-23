package com.example.car.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(nullable=false, updatable=false)
private Long id;

@Column(nullable=false, unique=true)
private String username;

@Column(nullable=false)
private String password;

@Column(nullable=false)
private String role;
}