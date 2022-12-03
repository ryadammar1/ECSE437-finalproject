package com.ecse437.project.exceptions;

import com.ecse437.project.common.Common.Algorithm;

public class IllegalAlgorithmException extends Exception{
	private static final long serialVersionUID = 1L;

	public IllegalAlgorithmException(Algorithm algorithm) {
        super("Unsupported algorithm: " + algorithm);
    }

}
