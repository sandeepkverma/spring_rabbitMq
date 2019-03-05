package com.san;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sender {

	private static final String SENDER_XML="sender.xml";
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(SENDER_XML);
		AmqpTemplate template = ctx.getBean(RabbitTemplate.class);
		
		int messageCount = 0;
		while (messageCount<10) {
			template.convertAndSend("hello message #:"+messageCount);
			messageCount ++;
		}
		
		System.out.println(messageCount+" messages sent successfully.");
		

	}

}
