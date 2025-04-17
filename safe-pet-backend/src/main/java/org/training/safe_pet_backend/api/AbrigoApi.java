package org.training.safe_pet_backend.api;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.training.safe_pet_backend.domain.Abrigo;
import org.training.safe_pet_backend.service.AbrigoService;

@RestController
@RequestMapping("/abrigo")
public class AbrigoApi {
    @Autowired
    private AbrigoService abrigoService;

    @PostMapping
    public Abrigo cadastro(@RequestBody @Valid Abrigo abrigo) {
        return abrigoService.cadastrar(abrigo);
    }
}
