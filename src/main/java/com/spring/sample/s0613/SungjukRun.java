package com.spring.sample.s0613;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SungjukRun {
	public static void main(String[] args) {
		// xml 불러오는 메소드. resources에 있어야지만 가능. resources 하위 폴더에 있는 xml이라면 아래와 같이 경로명도 지정해야함
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjuk.xml");

		SungjukVO vo1 = (SungjukVO) ctx.getBean("vo1"); // xml에서 생성한 bean의 id를 괄호에 넣기
		System.out.println("name : " + vo1.getName());
		System.out.println("kor : " + vo1.getKor());
		System.out.println("eng : " + vo1.getEng());
		System.out.println("mat : " + vo1.getMat());
		System.out.println();

		SungjukVO vo2 = (SungjukVO) ctx.getBean("vo2");
		System.out.println("name : " + vo2.getName());
		System.out.println("kor : " + vo2.getKor());
		System.out.println("eng : " + vo2.getEng());
		System.out.println("mat : " + vo2.getMat());
		System.out.println();

		SungjukVO vo3 = (SungjukVO) ctx.getBean("vo3");
		System.out.println("name : " + vo3.getName());
		System.out.println("kor : " + vo3.getKor());
		System.out.println("eng : " + vo3.getEng());
		System.out.println("mat : " + vo3.getMat());
		System.out.println();

		ctx.close();
	}
}
