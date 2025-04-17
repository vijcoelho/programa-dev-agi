package org.training.safe_pet_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.training.safe_pet_backend.domain.Animal;
import org.training.safe_pet_backend.domain.Voluntario;
import org.training.safe_pet_backend.repositories.AbrigoRepository;
import org.training.safe_pet_backend.repositories.AnimalRepository;
import org.training.safe_pet_backend.repositories.VoluntarioRepository;

import java.util.List;

@Service
public class VoluntarioService {
    @Autowired
    private VoluntarioRepository voluntarioRepository;
    @Autowired
    private AbrigoRepository abrigoRepository;
    @Autowired
    private AnimalRepository animalRepository;

    public ResponseEntity<?> cadastrarVoluntario(Voluntario voluntario) {
        List<Animal> animais = animalRepository.findAllByCpfVoluntario(voluntario.getCpf());
        if (animais.isEmpty()) {
            voluntarioRepository.save(voluntario);
            return ResponseEntity.ok("Tutor salvo com sucesso, porem sem animais no cadastro");
        }
        voluntario.setAnimais(animais);
        return ResponseEntity.ok("Tutor salvo com sucesso \n" + voluntarioRepository.save(voluntario));
    }
}
