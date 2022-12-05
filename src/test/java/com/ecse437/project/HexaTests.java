package com.ecse437.project;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecse437.project.services.Hexa;

@SpringBootTest
class HexaTests {
	
	@Test
	void HexaCalculation() {
		Hexa hexa = new Hexa();
		assertThat(hexa.compute(1610)).isEqualTo("64A");
	}
	
	@Test
	void hexaEdgeCaseLow(){
		Hexa hexa = new Hexa();
		assertThat(hexa.compute(0)).isEqualTo("0");
	}
	
	@Test
	void hexaEdgeCasehHigh(){
		Hexa hexa = new Hexa();
		assertThat(hexa.compute(2024)).isEqualTo("7E8");
	}

	@Test
	void printTest() {
		Hexa hexa = new Hexa();
		int n = 1610;
		String res = "64A";
		int runtime = 0;
		
		String actualMessage = hexa.Print(n, res, runtime);
		String expectedMessage = "<h3>"+"The hexadecimal representation of "+n+" is 0x"+res+"</h3>"
				+ "<h4>Runtime: "+(runtime)+" nanoseconds</h4>";
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
}
