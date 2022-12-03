package com.ecse437.project.services;

public class Squared implements Function{
	public String compute(int n) {
		return ""+(int)(Math.pow(n, 2));
	}
	
	public String Print(int n, String res, long runtime) {
	    return "<h3>"+n+" squared is "+res+"</h3>"
			+ "<h4>Runtime: "+(runtime)+" nanoseconds</h4>";
	}

}
