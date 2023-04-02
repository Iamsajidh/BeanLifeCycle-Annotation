package com.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp);
		((AnnotationConfigApplicationContext) context).close();
	}

}
