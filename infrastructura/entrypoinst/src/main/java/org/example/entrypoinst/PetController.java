package org.example.entrypoinst;

import org.example.model.Pet;
import org.example.usecase.CrearPetUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api")
public class PetController {
    private final CrearPetUseCase crearPetUseCase;

    public PetController(CrearPetUseCase crearPetUseCase) {
        this.crearPetUseCase = crearPetUseCase;
    }

    @PostMapping("/crearPet")
    public Mono<Pet> crearPet(@RequestBody Pet pet) {
        return crearPetUseCase.apply(pet);
    }
}
