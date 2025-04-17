package org.training.safe_pet_backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.training.safe_pet_backend.entities.Abrigo;

import java.util.Optional;

@Repository
public interface AbrigoRepository extends MongoRepository<Abrigo, String> {
    Optional<Abrigo> findByLocalizacao(String localizacao);
}
