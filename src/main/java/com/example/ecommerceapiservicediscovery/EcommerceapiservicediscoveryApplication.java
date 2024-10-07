package com.example.ecommerceapiservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EcommerceapiservicediscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceapiservicediscoveryApplication.class, args);
	}

}
