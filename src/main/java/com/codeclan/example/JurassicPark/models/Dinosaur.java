package com.codeclan.example.JurassicPark.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "user_dinosaur")
public class Dinosaur {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull

    private String name;
    private String photo;
    private boolean happiness;
    private boolean fullness;
    private boolean health;


}