package com.example.zoo.controller;

import com.example.zoo.model.Animal;
import com.example.zoo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    // Func-1
    @GetMapping("/all/animals")
    public ResponseEntity<?> getAllAnimal() throws Exception {
        try {
            return animalService.getAllAnimals();
        } catch (Exception e) {
            throw e;
        }
    }

    // Func-2
    @GetMapping("/find/animalsByClass")
    public ResponseEntity<?> getAllAnimal(@RequestParam String classAnimal) throws Exception {
        try {
            return animalService.findAnimalByClass(classAnimal);
        } catch (Exception e) {
            throw e;
        }
    }

    // Func-3
    @PostMapping("/add/animals")
    public ResponseEntity<?> addAnimal(@RequestBody Animal animal) throws Exception {
        try {
            return animalService.addAnimal(animal);
        } catch (Exception e) {
            throw e;
        }
    }

    // Func-3
    @DeleteMapping("/delete/animals")
    public ResponseEntity<?> deleteAnimal(@RequestParam Integer id) throws Exception {
        try {
            return animalService.deleteAnimal(id);
        } catch (Exception e) {
            throw e;
        }
    }

    // Func-4
    @GetMapping("/count/animalsByType")
    public ResponseEntity<?> countByTypeAnimal(@RequestParam String typeAnimal) throws Exception {
        try {
            return animalService.countByTypeAnimal(typeAnimal);
        } catch (Exception e) {
            throw e;
        }
    }
}
