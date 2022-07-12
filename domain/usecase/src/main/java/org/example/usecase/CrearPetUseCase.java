package org.example.usecase;

import org.example.model.Pet;
import org.example.model.gateway.PetRepository;
import reactor.core.publisher.Mono;

import java.util.function.Function;

public class CrearPetUseCase implements Function<Pet, Mono<Pet>> {
    private final PetRepository petRepository;

    public CrearPetUseCase(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Mono<Pet> apply(Pet pet) {
        return petRepository.save(pet);
    }
}
