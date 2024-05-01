package com.springboot.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.kafka.model.Employee;

@RestController
@RequestMapping("kafka")
public class Resource {

	@Autowired
	private KafkaTemplate<String, Employee> kafkaTemplate;

	@GetMapping("/publish/{name}")
	public String publish(@PathVariable("name") String employeeName) {
		kafkaTemplate.send("kafkaTopic", new Employee(employeeName, "CG", 456234, 12000.0));

		return "message published:" + employeeName;
	}

}
