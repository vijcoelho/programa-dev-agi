package org.training.safe_pet_backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.training.safe_pet_backend.domain.Tutor;

@Repository
public interface TutorRepository extends MongoRepository<Tutor, String> {
}
