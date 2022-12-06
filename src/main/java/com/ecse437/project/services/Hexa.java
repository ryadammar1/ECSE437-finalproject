package com.ecse437.project.services;

public class Hexa implements Function{
	public String compute(int n) {
		 if (n == 0) {
			 return "0";
		 }
		 
	     int rem;
	        
	     String res=""; 
	 
	     char hex[]={
	    		 '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	 
	     while(n>0)
	     {
	       rem=n%16; 
	       res=hex[rem]+res; 
	       n=n/16;
	     }
	     
	     return res;
	}

	public String Print(int n, String res, long runtime) {
	    return "<h3>"+"The hexadecimal representation of "+n+" is 0x"+res+"</h3>"
			+ "<h4>Runtime: "+(runtime)+" nanoseconds</h4>";
	}

}
