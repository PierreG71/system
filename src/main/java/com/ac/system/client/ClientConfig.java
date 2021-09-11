package com.ac.system.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.MARCH;

@Configuration
public class ClientConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository repository) {
        return args -> {
            Client pierre = new Client(
                    "Pierre",
                    "Gerber",
                    LocalDate.of(1971, AUGUST, 27),
                    "pierreg@allems.co.za",
                    50
            );

            Client lilia = new Client(
                    "Lilia",
                    "de Klerk",
                    LocalDate.of(2001, MARCH, 26),
                    "liliadeKlerk@gmail.com",
                    20
            );

            repository.saveAll(
                    List.of(pierre, lilia)
            );
        };
    }
}
