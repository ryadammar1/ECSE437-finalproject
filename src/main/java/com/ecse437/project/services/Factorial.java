package com.ecse437.project.services;

public class Factorial implements Function{
	public String Print(int n, String res, long runtime) {
	    return "<h3>"+"Factorial of "+n+" = "+res+"</h3>"
			+ "<h4>Runtime: "+(runtime)+" nanoseconds</h4>";
	}
	
	public String compute(int n) {
		long factorial = 1;
        for(int i = 1; i <= n; ++i)
        {
            factorial *= i;
        }
        return ""+factorial;
	}
}

