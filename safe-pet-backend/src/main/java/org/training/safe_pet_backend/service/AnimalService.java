package org.training.safe_pet_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.training.safe_pet_backend.domain.Abrigo;
import org.training.safe_pet_backend.domain.Animal;
import org.training.safe_pet_backend.domain.Voluntario;
import org.training.safe_pet_backend.repositories.AbrigoRepository;
import org.training.safe_pet_backend.repositories.AnimalRepository;
import org.training.safe_pet_backend.repositories.VoluntarioRepository;

import java.time.LocalDate;
import java.util.*;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private AbrigoRepository abrigoRepository;
    @Autowired
    private VoluntarioRepository voluntarioRepository;

    public ResponseEntity<?> salvar(Animal animal) {
        animalRepository.save(animal);
        List<Animal> animais = animalRepository.findAll();
        List<Animal> animaisVoluntario = animalRepository.findAllByCpfVoluntario(animal.getCpfVoluntario());
        Optional<Abrigo> abrigo = abrigoRepository.findByLocalizacao(animal.getLocalizacaoAbrigo());

        if (abrigo.isEmpty()) {
            return ResponseEntity.badRequest().body("Nao existe esse abrigo!");
        }
        Optional<Voluntario> voluntario = voluntarioRepository.findByCpf(animal.getCpfVoluntario());
        if (voluntario.isPresent() && voluntario.get().getLocalizacao().equals(animal.getLocalizacaoAbrigo())) {
            animal.setCpfVoluntario(voluntario.get().getCpf());
            voluntario.get().setAnimais(animaisVoluntario);
            voluntarioRepository.save(voluntario.get());
        }
        abrigo.get().setAnimais(animais);
        abrigoRepository.save(abrigo.get());
        return ResponseEntity.ok("Animal salvo com sucesso no abrigo!");
    }

    public Animal alterar(Map<String, String> request) {
        String id = request.get("id");
        Optional<Animal> optionalAnimal = animalRepository.findById(id);

        if (optionalAnimal.isEmpty()) {
            throw new RuntimeException("Animal não encontrado com id: " + id);
        }

        Animal animal = optionalAnimal.get();

        if (request.containsKey("nome")) {
            animal.setNome(request.get("nome"));
        }
        if (request.containsKey("dataNascimento")) {
            animal.setDataNascimento(LocalDate.parse(request.get("dataNascimento")));
        }
        if (request.containsKey("raca")) {
            animal.setRaca(request.get("raca"));
        }
        if (request.containsKey("vacinas")) {
            String vacinaStr = request.get("vacinas");
            List<String> vacinasNovas = Arrays.asList(vacinaStr.split("\\s*,\\s*"));

            List<String> vacinasExistentes = animal.getVacinas();
            if (vacinasExistentes == null) {
                vacinasExistentes = new ArrayList<>();
            }

            vacinasExistentes.addAll(vacinasNovas);
            animal.setVacinas(vacinasExistentes);
        }
        if (request.containsKey("castrado")) {
            animal.setCastrado(Boolean.parseBoolean(request.get("castrado")));
        }
        if (request.containsKey("adotado")) {
            animal.setAdotado(Boolean.parseBoolean(request.get("adotado")));
        }
        if (request.containsKey("cpfVoluntario")) {
            Optional<Voluntario> voluntario = voluntarioRepository.findByCpf(request.get("cpfVoluntario"));
            if (voluntario.isPresent() && voluntario.get().getLocalizacao().equals(animal.getLocalizacaoAbrigo())) {
                animal.setCpfVoluntario(voluntario.get().getCpf());
            }
        }

        return animalRepository.save(animal);
    }
}
