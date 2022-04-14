package com.example.zoo.repository;

import com.example.zoo.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    List<Animal> findByClassAnimal(String classAnimal);

    @Query(nativeQuery = true,value ="SELECT * FROM animal AS a WHERE a.class_animal = ?1")
    List<Animal> findByClassAnimalNative(String classAnimal);

    @Query(nativeQuery = true,value ="SELECT * FROM animal AS a WHERE a.type_animal = ?1")
    List<Animal> countByTypeAnimal(String typeAnimal);

    List<Animal> removeByAnimalId(Integer id);
}