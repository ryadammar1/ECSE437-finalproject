package com.ecse437.project.services;

public class Prime implements Function{
	public String Print(int n, String res, long runtime) {
	    return "<h3>"+(Boolean.valueOf(res) == true ? n+" is not a prime number" :
	    	n+" is a prime number")+"</h3>"+
	    	"<h4>Runtime: "+(runtime)+" nanoseconds</h4>";

	}
	
	public String compute(int n) {
	    boolean flag = false;
	    for (int i = 2; i <= n / 2; ++i) {
	      if (n % i == 0) {
	        flag = true;
	        break;
	      }
	    }
	    
	    return ""+flag;
	}

}
