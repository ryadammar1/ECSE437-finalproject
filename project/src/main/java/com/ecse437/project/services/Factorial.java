package com.ecse437.project.services;

public class Factorial implements Function{
	
	public long compute(int n) {
		long factorial = 1;
        for(int i = 1; i <= n; ++i)
        {
            factorial *= i;
        }
        return factorial;
	}
}

