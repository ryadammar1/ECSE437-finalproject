package com.ecse437.project;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecse437.project.common.Common.Algorithm;
import com.ecse437.project.common.MyRandomUtility;
import com.ecse437.project.exceptions.IllegalAlgorithmException;
import com.ecse437.project.services.Main;

@SpringBootTest
class IntegrationTest {

	@Test
	void testIntegrationBinary() throws IllegalAlgorithmException {
		MyRandomUtility randUtilMock = Mockito.mock(MyRandomUtility.class);
		when(randUtilMock.getRandom(anyInt(), anyInt())).thenReturn((int)10);
		
		Main.randUtil = randUtilMock;
		
		int n = 10;
		String res = "1010";
		
		String actualMessage = Main.generateAlgorithmOutput(Algorithm.Binary);
		System.out.println(actualMessage);
		String expectedMessage = "The binary representation of "+n+" is "+res;
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testIntegrationFactorial() throws IllegalAlgorithmException {
		MyRandomUtility randUtilMock = Mockito.mock(MyRandomUtility.class);
		when(randUtilMock.getRandom(anyInt(), anyInt())).thenReturn((int)8);
		
		Main.randUtil = randUtilMock;
		
		int n = 8;
		String res = "40320";
		
		String actualMessage = Main.generateAlgorithmOutput(Algorithm.Factorial);
		System.out.println(actualMessage);
		String expectedMessage = "Factorial of "+n+" = "+res;
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testIntegrationHexa() throws IllegalAlgorithmException {
		MyRandomUtility randUtilMock = Mockito.mock(MyRandomUtility.class);
		when(randUtilMock.getRandom(anyInt(), anyInt())).thenReturn((int)1610);
		
		Main.randUtil = randUtilMock;
		
		int n = 1610;
		String res = "64A";
		
		String actualMessage = Main.generateAlgorithmOutput(Algorithm.Hexa);
		System.out.println(actualMessage);
		String expectedMessage = "The hexadecimal representation of "+n+" is 0x"+res;
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testIntegrationPrime() throws IllegalAlgorithmException {
		MyRandomUtility randUtilMock = Mockito.mock(MyRandomUtility.class);
		when(randUtilMock.getRandom(anyInt(), anyInt())).thenReturn((int)509);
		
		Main.randUtil = randUtilMock;
		
		int n = 509;
		String res = "false";
		
		String actualMessage = Main.generateAlgorithmOutput(Algorithm.Prime);
		System.out.println(actualMessage);
		String expectedMessage = Boolean.valueOf(res) == true ? n+" is not a prime number" :
	    	n+" is a prime number";
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testIntegrationSquared() throws IllegalAlgorithmException {
		MyRandomUtility randUtilMock = Mockito.mock(MyRandomUtility.class);
		when(randUtilMock.getRandom(anyInt(), anyInt())).thenReturn((int)122);
		
		Main.randUtil = randUtilMock;
		
		int n = 122;
		String res = "14884";
		
		String actualMessage = Main.generateAlgorithmOutput(Algorithm.Squared);
		System.out.println(actualMessage);
		String expectedMessage = n+" squared is "+res;
		assertTrue(actualMessage.contains(expectedMessage));
	}

}
