package com.ecse437.project.services;

import java.util.Random;

import com.ecse437.project.common.Common.Algorithm;
import com.ecse437.project.exceptions.IllegalAlgorithmException;

public class Main {
	
	static Random rand = new Random();

	public static String generateAlgorithmOutput(Algorithm algorithm) throws IllegalAlgorithmException {
		int n = rand.nextInt(0, 11);
		
		switch(algorithm) {
		  case Factorial:
			return computeResultAndRuntime(n, new Factorial());
		  default:
		    throw new IllegalAlgorithmException(algorithm);
		}
	}
	
	private static String computeResultAndRuntime(int n, Function function) {
		long startTime = System.nanoTime();
		
		long res = function.compute(n);
				
		long endTime = System.nanoTime();
		
	    return "<h3>"+"Factorial of "+n+" = "+res+"</h3>"
			+ "<h4>Runtime: "+(endTime - startTime)+" nanoseconds</h4>";
	}

	public static String generateMenu() {
		String menu = "<h1>Functions<h2>";
		
		for (Algorithm algo : Algorithm.values()) { 
			menu += "<h3>/"+ algo + "<br>" + "</h3>";
		}
		
		return menu;
	}

}
