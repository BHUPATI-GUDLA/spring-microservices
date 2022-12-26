package com.spring.microservices.limitsservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservices.limitsservices.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {

	@Autowired
	LimitConfiguration config;
	
	@GetMapping("/limit")
	private LimitConfiguration retriveLimitConfiguration() {
		return new LimitConfiguration(config.getProfile(), config.getMinimum(), config.getMaximum());
	}

}
