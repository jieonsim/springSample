package com.spring.sample.s0613;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  
비만도(BMI) 계산하는 프로그램을 만드시오.  
공식 : 몸무게 / (키백분율 * 키백분율)  
예) 키:170Cm, 몸무게:65Kg  
   비만지수 구하는 공식 : 65 / (1.7 * 1.7)  
   비만지수에 대한 판정?  
     저체중: 18.5미만, 표준 : 18.5~23 , 과체중:23~25, 비만:25초과  
	 파이널 상수로 18.5 미만 23 25 25 초과를 지정
	 비만지수값을 xml에 넣고 ..?
	 그냥 개인별 키와 몸무게만 넣고 스위치로 비교..?
   데이터의 주입은 xml을 통해서 처리한다.(입력값 : 비만지수값, 개인별 성명/키/몸무게)  
*/

public class BMIRun2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/bmi2.xml");

		BMIVO2[] persons = {(BMIVO2) ctx.getBean("person1"),(BMIVO2) ctx.getBean("person2"),(BMIVO2) ctx.getBean("person3")};
		
		BMIVO2 vo = new BMIVO2();
		String str = vo.getService().printLine();
		for(BMIVO2 person : persons) {
			str += person.getService().calc(person);
			str += person.getService().printLine();
		}
		System.out.println(str);
		
		ctx.close();
	}
}
