package com.lp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.service.TestService;
import com.lp.service.TestServiceConsumer;

@Service
public class TestServiceConsumerImpl implements TestServiceConsumer {

	@Autowired
	private TestService testService;
	
	@Override
	public String testDubbo(String name) {
		System.out.println("consumer run ...");
		return testService.testDubbo(name);
	}

}
