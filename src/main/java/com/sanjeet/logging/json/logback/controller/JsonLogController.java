package com.sanjeet.logging.json.logback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class JsonLogController {
	
	@GetMapping("/log")
	public String addLog() {
		log.info("log info added");
		log.debug("log debug added");
		log.error("log error added");
		return "log added";
	}
	
	
}
