package com.san.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListnerContainer {

	private static final String CONSUMER_XML="consumer.xml";
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext(CONSUMER_XML);
	}
}
