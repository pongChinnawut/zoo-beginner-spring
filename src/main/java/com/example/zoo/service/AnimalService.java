package com.example.zoo.service;

import com.example.zoo.model.Animal;
import com.example.zoo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    public ResponseEntity<?> getAllAnimals() throws Exception {
       try {
           return ResponseEntity.status(200).body(animalRepository.findAll());
       } catch (Exception e) {
           throw e;
       }
    }

    public ResponseEntity<?> findAnimalByClass(String classAnimal) throws Exception {
        try {
            return ResponseEntity.status(200).body(animalRepository.findByClassAnimalNative(classAnimal));
        } catch (Exception e) {
            throw e;
        }
    }

    public ResponseEntity<?> countByTypeAnimal(String typeAnimal) throws Exception {
        try {
            return ResponseEntity.status(200).body(animalRepository.countByTypeAnimal(typeAnimal).size());
        } catch (Exception e) {
            throw e;
        }
    }

    public ResponseEntity<?> addAnimal(Animal animal) throws Exception {
        try {
            return ResponseEntity.status(200).body(animalRepository.save(animal));
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public ResponseEntity<?> deleteAnimal(Integer id) throws Exception {
        try {
            List<Animal> reponseFromDel= animalRepository.removeByAnimalId(id);
            return ResponseEntity.status(200).body(reponseFromDel);
        } catch (Exception e) {
            throw e;
        }
    }
}
