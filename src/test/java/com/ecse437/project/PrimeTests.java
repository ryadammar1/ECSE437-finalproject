package com.ecse437.project;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecse437.project.services.Prime;

@SpringBootTest
class PrimeTests {

	@Test
	void PrimeCalculation() {
		Prime prime = new Prime();
		assertThat(prime.compute(509)).isEqualTo("false");
	}
	
	@Test
	void primeEdgeCaseLow(){
		Prime prime = new Prime();
		assertThat(prime.compute(2)).isEqualTo("false");
	}
	
	@Test
	void primeEdgeCasehHigh(){
		Prime prime = new Prime();
		assertThat(prime.compute(512)).isEqualTo("true");
	}
	
	@Test
	void printTest() {
		Prime prime = new Prime();
		int n = 2;
		String res = "false";
		int runtime = 0;
		
		String actualMessage = prime.Print(n, res, runtime);
		String expectedMessage = "<h3>"+(Boolean.valueOf(res) == true ? n+" is not a prime number" :
	    	n+" is a prime number")+"</h3>"+
	    	"<h4>Runtime: "+(runtime)+" nanoseconds</h4>";
		
		assertTrue(actualMessage.contains(expectedMessage));
	}

}
