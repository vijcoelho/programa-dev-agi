package org.training.safe_pet_backend.api.tutor;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.training.safe_pet_backend.entities.Tutor;
import org.training.safe_pet_backend.service.TutorService;

@RestController
@RequestMapping("/tutor")
public class TutorController {
    @Autowired
    private TutorService tutorService;

    @PostMapping
    public ResponseEntity<?> cadastro(@RequestBody @Valid Tutor tutor) {
        return tutorService.cadastrarTutor(tutor);
    }
}
