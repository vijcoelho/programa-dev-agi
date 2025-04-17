package org.training.safe_pet_backend.api;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.training.safe_pet_backend.domain.Voluntario;
import org.training.safe_pet_backend.service.VoluntarioService;

@RestController
@RequestMapping("/voluntario")
public class VoluntarioApi {
    @Autowired
    private VoluntarioService voluntarioService;

    @PostMapping
    public ResponseEntity<?> cadastro(@RequestBody @Valid Voluntario voluntario) {
        return voluntarioService.cadastrarVoluntario(voluntario);
    }
}
