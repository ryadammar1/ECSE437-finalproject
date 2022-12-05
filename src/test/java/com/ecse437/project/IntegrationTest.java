package com.ecse437.project;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecse437.project.common.Common.Algorithm;
import com.ecse437.project.common.MyRandomUtility;
import com.ecse437.project.exceptions.IllegalAlgorithmException;
import com.ecse437.project.services.Main;

@SpringBootTest
class IntegrationTest {

	@Mock
	MyRandomUtility randUtil;
	
	@Test
	void testIntegration() throws IllegalAlgorithmException {
		when(randUtil.getRandom(anyInt(), anyInt())).thenReturn((int)10);
		int n = 10;
		String res = "1010";
		
		String actualMessage = Main.generateAlgorithmOutput(Algorithm.Binary);
		System.out.println(actualMessage);
		String expectedMessage = "The binary representation of "+n+" is "+res;
		assertTrue(actualMessage.contains(expectedMessage));
	}

}
