package com.ecse437.project.services;

public class Binary implements Function {
	public String compute(int n) {
		if (n == 0) {
			 return "0";
		 }
		
		String s = "";
	    while (n > 0)
	    {
	        s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
	        n = n / 2;
	    }
	    return s;
	}

	public String Print(int n, String res, long runtime) {
	    return "<h3>"+"The binary representation of "+n+" is "+res+"</h3>"
			+ "<h4>Runtime: "+(runtime)+" nanoseconds</h4>";
	}

}
