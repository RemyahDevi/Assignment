package com.example.billing.billing;

import com.example.payments.Gateway;
import com.example.payments.RecurlyGateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class BillingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingApplication.class, args);}

	@Bean
	Gateway paymentGateway() {
		return new RecurlyGateway();
	}

}