package com.ac.system.client;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ClientService {
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
