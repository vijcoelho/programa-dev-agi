package org.training.safe_pet_backend.api;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.training.safe_pet_backend.domain.Animal;
import org.training.safe_pet_backend.service.AnimalService;

import java.util.Map;

@RestController
@RequestMapping("/animal")
public class AnimalApi {

    @Autowired
    private AnimalService animalService;

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody @Valid Animal animal) {
        return animalService.salvar(animal);
    }

    @PutMapping("/alterar")
    public Animal alterar(@RequestBody Map<String, String> request) {
        return animalService.alterar(request);
    }
}
