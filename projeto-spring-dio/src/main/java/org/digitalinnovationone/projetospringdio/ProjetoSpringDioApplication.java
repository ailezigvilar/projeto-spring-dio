package org.digitalinnovationone.projetospringdio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjetoSpringDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringDioApplication.class, args);
	}

}
