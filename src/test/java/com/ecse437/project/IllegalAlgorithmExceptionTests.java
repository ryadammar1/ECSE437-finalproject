package com.ecse437.project;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecse437.project.common.Common.Algorithm;
import com.ecse437.project.exceptions.IllegalAlgorithmException;

@SpringBootTest
class IllegalAlgorithmExceptionTests {
		  
	@Test
	void ExceptionThrown() {

		Exception exception = assertThrows(IllegalAlgorithmException.class, () -> 
		{
			throw new IllegalAlgorithmException(Algorithm.Binary);
		});
		
		String expectedMessage = "Unsupported algorithm: ";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	
}
