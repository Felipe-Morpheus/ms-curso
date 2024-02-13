package com.ms.email.configs;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class RabbitMQConfig {

	// ATB
	@Value("${broker.queue.email.name}")
	private String queue;

	// METODO DECLARAR
	@Bean
	public Queue queue() {
		return new Queue(queue, true);
	}
	
	// Config de conversão JSON para Java
	@Bean
	public Jackson2JsonMessageConverter messageConverter() {
		ObjectMapper objectMapper = new ObjectMapper();
		return new Jackson2JsonMessageConverter(objectMapper);
	}

}
/*
 * Conexão com BROKER. Fila de mensagem que chegam.
 */
