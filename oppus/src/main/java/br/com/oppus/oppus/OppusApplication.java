package br.com.oppus.oppus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("br.com.oppus.oppus.model")
public class OppusApplication {

	public static void main(String[] args) {

		SpringApplication.run(OppusApplication.class, args);
	}

}
