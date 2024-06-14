package com.spring.sample.s0613;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebSiteRun2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/webSite2.xml");
		
		WebSiteInfo2 info = (WebSiteInfo2) ctx.getBean("info");
		
		System.out.println("생성자로 값 주입 후 Getter로 읽어오기");
		System.out.println("Driver : " + info.getDriver());
		System.out.println("url : " + info.getUrl());
		System.out.println("user : " + info.getUser());
		System.out.println("password : " + info.getPassword());
		
		ctx.close();
	}
}
