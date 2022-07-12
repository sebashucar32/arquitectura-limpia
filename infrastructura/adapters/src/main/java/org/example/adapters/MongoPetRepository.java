package org.example.adapters;

import org.example.model.Pet;
import org.example.model.gateway.PetRepository;
import reactor.core.publisher.Mono;

public class MongoPetRepository implements PetRepository {
    private final MongoRespository mongoRespository;

    public MongoPetRepository(MongoRespository mongoRespository) {
        this.mongoRespository = mongoRespository;
    }

    @Override
    public Mono<Pet> save(Pet pet) {
        PetDocument petDocument = new PetDocument();
        petDocument.setId(pet.getId());
        petDocument.setName(pet.getName());
        petDocument.setBreed(pet.getBreed());

        return mongoRespository.save(petDocument).map(p -> {
            var petMongo = new Pet();
            petMongo.setId(p.getId());
            petMongo.setName(p.getName());
            petMongo.setBreed(p.getBreed());
            return petMongo;
        });
    }
}
