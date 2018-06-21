package com.lp.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) throws Exception {
		// 1. 初始化spring容器
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println(context);

		System.out.println("provider starting ....");

		// 2. 启动容器
		context.start(); 

		System.out.println("provider started ...");

		// 3. 测试代码,为了保证服务端启动后,不自动关闭. 使用阻塞方法,暂停线程.
		System.in.read();
	}

}
