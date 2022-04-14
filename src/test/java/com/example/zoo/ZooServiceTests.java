package com.example.zoo;

import com.example.zoo.model.Animal;
import com.example.zoo.repository.AnimalRepository;
import com.example.zoo.service.AnimalService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ZooServiceTests {

	@InjectMocks
	private AnimalService animalService;

	@Mock
	private AnimalRepository animalRepository;

	@Test
	void testFindAllService() throws Exception {
		List<Animal> listAnimal = new ArrayList<>();
		Animal animal = new Animal();
		animal.setAgeAnimal(2);
		animal.setGender("male");
		animal.setClassAnimal("fox");
		listAnimal.add(animal);
		Mockito.when(animalRepository.findAll()).thenReturn(listAnimal);
		ResponseEntity responseEntity =  animalService.getAllAnimals();
		assertEquals(listAnimal, responseEntity.getBody());
	}

	@Test
	void testFindAnimalByClassService() throws Exception {
		List<Animal> listAnimal = new ArrayList<>();
		Animal animal = new Animal();
		animal.setAgeAnimal(2);
		animal.setGender("male");
		animal.setClassAnimal("ant");
		listAnimal.add(animal);
		Mockito.when(animalRepository.countByTypeAnimal(Mockito.anyString())).thenReturn(listAnimal);
		ResponseEntity responseEntity =  animalService.countByTypeAnimal(Mockito.anyString());
		assertEquals(1, responseEntity.getBody());
		Mockito.verify(animalRepository, Mockito.times(1)).countByTypeAnimal(Mockito.anyString());
	}

}
