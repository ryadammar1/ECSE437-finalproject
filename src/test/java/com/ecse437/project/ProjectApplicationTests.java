package com.ecse437.project;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecse437.project.common.Common.Algorithm;
import com.ecse437.project.controller.ProjectController;
import com.ecse437.project.exceptions.IllegalAlgorithmException;
import com.ecse437.project.services.Binary;
import com.ecse437.project.services.Factorial;
import com.ecse437.project.services.Hexa;
import com.ecse437.project.services.Main;
import com.ecse437.project.services.Prime;
import com.ecse437.project.services.Squared;

@SpringBootTest
class ProjectApplicationTests {

	@Autowired
	private ProjectController controller;
	
	@Mock
	private Binary binary;
	
	@Mock
	private Factorial factorial;
	
	@Mock
	private Hexa hexa;
	
	@Mock
	private Prime prime;
	
	@Mock
	private Squared squared;
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
	
	@Test
	void binaryCalculation() {
		binary = new Binary();
		assertThat(binary.compute(255).toString()).isEqualTo("11111111");
	}
	
	@Test
	void FactorialCalculation() {
		factorial = new Factorial();
		assertThat(factorial.compute(8).toString()).isEqualTo("40320");
	}
	
	@Test
	void HexaCalculation() {
		hexa = new Hexa();
		assertThat(hexa.compute(1610).toString()).isEqualTo("64A");
	}
	
	@Test
	void PrimeCalculation() {
		prime = new Prime();
		assertThat(prime.compute(509).toString()).isEqualTo("false");
	}
	
	@Test
	void SquaredCalculation() {
		squared = new Squared();
		assertThat(squared.compute(122).toString()).isEqualTo("14884");
	}
	
	@Test
	void SystemIntegration() throws IllegalAlgorithmException {
		assertThat(Main.generateAlgorithmOutput(Algorithm.Factorial).toString()).isNotNull();
		assertThat(Main.generateAlgorithmOutput(Algorithm.Prime).toString()).isNotNull();
		assertThat(Main.generateAlgorithmOutput(Algorithm.Binary).toString()).isNotNull();
		assertThat(Main.generateAlgorithmOutput(Algorithm.Hexa).toString()).isNotNull();
		assertThat(Main.generateAlgorithmOutput(Algorithm.Squared).toString()).isNotNull();
	}

}
