package com.ecse437.project.common;

import java.util.Random;

public class MyRandomUtility {
	static Random rand = new Random();
	
	public int getRandom(int a, int b){
	      return rand.nextInt(a, b);
	  }

}
