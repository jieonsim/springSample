package com.spring.sample.s0613;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebSiteRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/webSite.xml");
		
		WebSiteInfo info = (WebSiteInfo) ctx.getBean("info");
		
		System.out.println("Setter로 값 주입 후 Getter로 읽어오기");
		System.out.println("Driver : " + info.getDriver());
		System.out.println("url : " + info.getUrl());
		System.out.println("user : " + info.getUser());
		System.out.println("password : " + info.getPassword());
		
		ctx.close();
	}
}
