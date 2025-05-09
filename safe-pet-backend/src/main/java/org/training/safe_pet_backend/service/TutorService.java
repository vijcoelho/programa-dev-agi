package org.training.safe_pet_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.training.safe_pet_backend.entities.Tutor;
import org.training.safe_pet_backend.repositories.TutorRepository;

@Service
public class TutorService {
    @Autowired
    private TutorRepository tutorRepository;

    public ResponseEntity<?> cadastrarTutor(Tutor tutor) {
        tutor.setRespondeu(false);
        return ResponseEntity.ok(tutorRepository.save(tutor));
    }
}
