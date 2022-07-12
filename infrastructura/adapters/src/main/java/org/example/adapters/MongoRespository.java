package org.example.adapters;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MongoRespository extends ReactiveCrudRepository<PetDocument, String> {

}
