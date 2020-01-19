package com.example.service;

import com.rabbitmq.client.ConnectionFactory;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CatalogServiceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	// public RabbitTemplate rabbitTemplate(){
	// 	ConnectionFactory connectionFactory = new ConnectionFactory();
	// 	connectionFactory.setHost(rabbitmqHost);
		
	// 	RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);

	// 	//rabbitTemplate.se
	// 	return rabbitTemplate;
	// }
}
