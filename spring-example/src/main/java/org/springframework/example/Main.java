package org.springframework.example;


import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("./bean-config.xml");
		System.out.println(context.getBean("aobj"));
	}
}