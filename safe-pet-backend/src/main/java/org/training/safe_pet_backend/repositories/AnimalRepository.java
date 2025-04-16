package org.training.safe_pet_backend.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.training.safe_pet_backend.domain.Animal;

public interface AnimalRepository extends MongoRepository<Animal, ObjectId> {
}
