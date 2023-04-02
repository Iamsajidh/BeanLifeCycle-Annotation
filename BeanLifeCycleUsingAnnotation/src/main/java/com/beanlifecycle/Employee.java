package com.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("Sajid")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Method Start");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Method end");
	}
}
