package com.ecse437.project.services;

import java.util.Random;

import com.ecse437.project.common.Common.Algorithm;
import com.ecse437.project.exceptions.IllegalAlgorithmException;

public class Main {
	
	static Random rand = new Random();

	public static String generateAlgorithmOutput(Algorithm algorithm) throws IllegalAlgorithmException {
		int n;
		switch(algorithm) {
		  case Factorial:
			n = rand.nextInt(0, 11);
			return computeResultAndRuntime(n, new Factorial());
		  case Prime:
			n = rand.nextInt(0, 500);
			return computeResultAndRuntime(n, new Prime());
		  default:
		    throw new IllegalAlgorithmException(algorithm);
		}
	}
	
	private static String computeResultAndRuntime(int n, Function function) {
		long startTime = System.nanoTime();
		
		String res = function.compute(n);
				
		long endTime = System.nanoTime();
		
	    return function.Print(n, res, (endTime - startTime));
	}

	public static String generateMenu() {
		String menu = "<h1>Functions<h2>";
		
		for (Algorithm algo : Algorithm.values()) { 
			menu += "<h3>/"+ algo + "<br>" + "</h3>";
		}
		
		return menu;
	}

}
