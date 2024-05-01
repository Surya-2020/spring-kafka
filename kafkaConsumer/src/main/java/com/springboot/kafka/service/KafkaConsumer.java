package com.springboot.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;

import com.springboot.kafka.model.Employee;

public class KafkaConsumer {

	
	@KafkaListener(topics="kafkaTopic",groupId="group_consume")
	public void consumeJson(Employee employee)
	{
		System.out.println("Message Consumed"+employee);
	}
}
