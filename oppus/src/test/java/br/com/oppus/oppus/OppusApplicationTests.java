package br.com.oppus.oppus;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class OppusApplicationTests {

	private BigDecimal meuSalarioDeProgramador = new BigDecimal(("10.00"));

	@Test
	void contextLoads() {
		System.out.println("Começando o debug");
		System.out.println("O salário de programador é: " + meuSalarioDeProgramador);
		System.out.println("Fim do debug");
	}

}
