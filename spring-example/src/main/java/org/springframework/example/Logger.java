package org.springframework.example;


public class Logger {
	public Logger(){}
	public void recordBefore() {
		System.out.println("执行函数前");
	}

	public void recordAfter() {
		System.out.println("函数执行后");
	}
}
