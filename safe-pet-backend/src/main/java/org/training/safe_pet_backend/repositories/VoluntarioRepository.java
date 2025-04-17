package org.training.safe_pet_backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.training.safe_pet_backend.entities.Voluntario;

import java.util.Optional;

@Repository
public interface VoluntarioRepository extends MongoRepository<Voluntario, String> {
    Optional<Voluntario> findByCpf(String cpf);
}
