package com.lp.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lp.service.TestServiceConsumer;
//import com.lp.service.impl.TestServiceConsumerImpl; 

public class TestDubbo {
	public static void main(String[] args) throws IOException{
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:/*.xml");//applicationContext.xml
		
		TestServiceConsumer consumer = 
				(TestServiceConsumer) context.getBean("testServiceConsumerImpl");
		
		String result = consumer.testDubbo("lizhaopengÄãºÃ");
		System.out.println(result);
		//System.in.read();
	}
}
