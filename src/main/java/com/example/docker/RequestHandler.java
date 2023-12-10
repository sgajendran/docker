package com.example.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHandler {

	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
}
