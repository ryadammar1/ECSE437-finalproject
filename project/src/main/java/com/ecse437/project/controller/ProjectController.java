package com.ecse437.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecse437.project.common.Common;
import com.ecse437.project.exceptions.IllegalAlgorithmException;
import com.ecse437.project.services.Main;

@RestController
public class ProjectController {

	@GetMapping("/")
	public String index() {
		return Main.generateMenu();
	}

	@GetMapping("/Factorial")
	public String function1() throws IllegalAlgorithmException {
		return Main.generateAlgorithmOutput(Common.Algorithm.Factorial);
	}

}