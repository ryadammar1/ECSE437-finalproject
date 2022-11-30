package com.ecse437.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

	@GetMapping("/")
	public String index() {

		return "Hello world!";
	}

}