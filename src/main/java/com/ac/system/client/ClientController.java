package com.ac.system.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/client")

public class ClientController {

    @GetMapping
    public List<Client> getClients() {
        return List.of(
                new Client(
                        1L,
                        "Pierre",
                        "Gerber",
                        LocalDate.of(1971, Month.AUGUST, 27),
                        "pierreg@allems.co.za",
                        50
                )
        );
    }
}
