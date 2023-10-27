package com.mmkarami.spring;

import java.util.Date;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyApp {

	public static void main(String[] args) {

		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			Person person = context.getBean("employee", Person.class);
			person.printBill(new Bill(new Date(), "This is the content of Bill."));
		}
	}
}