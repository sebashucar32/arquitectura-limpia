package org.example.webservices;

import org.example.model.gateway.PetRepository;
import org.example.usecase.CrearPetUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@ComponentScan(basePackages = "org.example",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$"),
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+Repository$"),
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+Controller$"),
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "MongoRepository")
        },
        useDefaultFilters = false)
@Configuration
public class UseCaseConfig {

}
