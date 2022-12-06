package com.ecse437.project;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecse437.project.services.Binary;

@SpringBootTest
class BinaryTests {

	@Test
	void binaryCalculation() {
		Binary binary = new Binary();
		assertThat(binary.compute(255)).isEqualTo("11111111");
	}
	
	@Test
	void binaryEdgeCaseLow() {
		Binary binary = new Binary();
		assertThat(binary.compute(0)).isEqualTo("0");
	}
	
	@Test
	void binaryEdgeCasehHigh() {
		Binary binary = new Binary();
		assertThat(binary.compute(256)).isEqualTo("100000000");
	}
	
	@Test
	void printTest() {
		Binary binary = new Binary();
		int n = 255;
		String res = "11111111";
		int runtime = 0;
		
		String actualMessage = binary.Print(n, res, runtime);
		String expectedMessage = "<h3>"+"The binary representation of "+n+" is "+res+"</h3>"
		+ "<h4>Runtime: "+(runtime)+" nanoseconds</h4>";
		
		assertTrue(actualMessage.contains(expectedMessage));
	}

}
