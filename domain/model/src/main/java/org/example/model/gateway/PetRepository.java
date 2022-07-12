package org.example.model.gateway;

import org.example.model.Pet;
import reactor.core.publisher.Mono;

public interface PetRepository {
    Mono<Pet> save(Pet pet);

}
