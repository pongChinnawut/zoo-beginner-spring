package com.example.zoo.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_id")
    private Integer animalId;

    @Column(name = "type_animal")
    private String typeAnimal;

    @Column(name = "class_animal")
    private String classAnimal;

    @Column(name = "name_animal")
    private String nameAnimal;

    @Column(name = "age_animal")
    private Integer ageAnimal;

    private String gender;
}