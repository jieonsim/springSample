package com.spring.sample.s0613;

public class Calculator1Run {
	public static void main(String[] args) {
		Calculator1 calc = new Calculator1();
		
		// setter를 통한 값 주입 방법
		calc.setSu1(100);
		calc.setSu2(200);
		
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}
}
