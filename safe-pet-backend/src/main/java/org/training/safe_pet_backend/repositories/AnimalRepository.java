package org.training.safe_pet_backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.training.safe_pet_backend.domain.Animal;

import java.util.List;

public interface AnimalRepository extends MongoRepository<Animal, String> {
    List<Animal> findAllByCpfVoluntario(String cpfVoluntario);
}
