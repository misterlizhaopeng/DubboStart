package com.lp.serviceImpl;

import org.springframework.stereotype.Service;

import com.lp.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	@Override
	public String testDubbo(String name) {
		System.out.println("Provider run..");
		return "Hello :" + name;
	}
}
