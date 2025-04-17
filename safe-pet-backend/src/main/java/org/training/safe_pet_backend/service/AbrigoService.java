package org.training.safe_pet_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training.safe_pet_backend.domain.Abrigo;
import org.training.safe_pet_backend.domain.Animal;
import org.training.safe_pet_backend.repositories.AbrigoRepository;
import org.training.safe_pet_backend.repositories.AnimalRepository;

import java.util.List;

@Service
public class AbrigoService {

    @Autowired
    private AbrigoRepository abrigoRepository;
    @Autowired
    private AnimalRepository animalRepository;

    public Abrigo cadastrar(Abrigo abrigo) {
        List<Animal> animais = animalRepository.findAll();
        abrigo.setAnimais(animais);
        return abrigoRepository.save(abrigo);
    }
}
