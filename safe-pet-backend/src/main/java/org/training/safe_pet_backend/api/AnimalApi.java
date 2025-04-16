package org.training.safe_pet_backend.api;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.training.safe_pet_backend.domain.Animal;
import org.training.safe_pet_backend.repositories.AnimalRepository;

@RestController
@RequestMapping("/animal")
public class AnimalApi {

    private final AnimalRepository animalRepository;

    public AnimalApi(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @PostMapping
    public Animal salvar(@RequestBody @Valid Animal animal) {
        return animalRepository.save(animal);
    }
}
