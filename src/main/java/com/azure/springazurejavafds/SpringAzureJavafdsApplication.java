package com.azure.springazurejavafds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureJavafdsApplication {
	
	@GetMapping("/azmsg")
	public String showDeploy()
	{
		return "This is deployment of spring project in Azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureJavafdsApplication.class, args);
	}

}
