package com.ecse437.project;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecse437.project.services.Squared;

@SpringBootTest
class SquaredTests {

	@Test
	void SquaredCalculation() {
		Squared squared = new Squared();
		assertThat(squared.compute(122).toString()).isEqualTo("14884");
	}
	
	@Test
	void squaredEdgeCaseLow(){
		Squared squared = new Squared();
		assertThat(squared.compute(0).toString()).isEqualTo("0");
	}
	
	@Test
	void squaredEdgeCasehHigh(){
		Squared squared = new Squared();
		assertThat(squared.compute(256).toString()).isEqualTo("65536");
	}
	
	@Test
	void printTest() {
		Squared squared = new Squared();
		int n = 122;
		String res = "14884";
		int runtime = 0;
		
		String actualMessage = squared.Print(n, res, runtime);
		String expectedMessage = "<h3>"+n+" squared is "+res+"</h3>"
				+ "<h4>Runtime: "+(runtime)+" nanoseconds</h4>";
		
		assertTrue(actualMessage.contains(expectedMessage));
	}

}
