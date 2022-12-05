package com.ecse437.project;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecse437.project.services.Factorial;

@SpringBootTest
class FactorialTests {
	
	@Test
	void FactorialCalculation() {
		Factorial factorial = new Factorial();
		assertThat(factorial.compute(8)).isEqualTo("40320");
	}
	
	@Test
	void factorialEdgeCaseLow(){
		Factorial factorial = new Factorial();
		assertThat(factorial.compute(0)).isEqualTo("1");
	}
	
	@Test
	void factorialEdgeCasehHigh(){
		Factorial factorial = new Factorial();
		assertThat(factorial.compute(11)).isEqualTo("39916800");
	}
	
	@Test
	void printTest() {
		Factorial factorial = new Factorial();
		int n = 8;
		String res = "40320";
		int runtime = 0;
		
		String actualMessage = factorial.Print(n, res, runtime);
		String expectedMessage = "<h3>"+"Factorial of "+n+" = "+res+"</h3>"
				+ "<h4>Runtime: "+(runtime)+" nanoseconds</h4>";
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
}
