package com.lp.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) throws Exception {
		// 1. ��ʼ��spring����
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println(context);

		System.out.println("provider starting ....");

		// 2. ��������
		context.start(); 

		System.out.println("provider started ...");

		// 3. ���Դ���,Ϊ�˱�֤�����������,���Զ��ر�. ʹ����������,��ͣ�߳�.
		System.in.read();
	}

}
