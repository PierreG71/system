package com.ac.system;

import com.ac.system.client.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}

	@GetMapping
	public List<Client> hello() {
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