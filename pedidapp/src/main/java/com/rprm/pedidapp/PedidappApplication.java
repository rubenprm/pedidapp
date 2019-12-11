package com.rprm.pedidapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PedidappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidappApplication.class, args);
		/*ApplicationContext applicationContext =
	            SpringApplication.run(PedidappApplication.class, args);
	        for (String name: applicationContext.getBeanDefinitionNames()) {
	            System.out.println(name);
	        }*/
	}

}
