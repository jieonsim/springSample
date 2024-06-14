package com.spring.sample.s0613;

public class BMIService {
	public void printLine() {
		System.out.println("--------------------------------------------------------------");
	}

	public void printTitle() {
		System.out.println("이름\t키\t몸무게\tBMI\t등급");
	}

	public BMIVO calc(BMIVO vo) {
		double height = vo.getHeight() / 100.0;
		double bmi = vo.getWeight() / (height * height);
		String grade = "";

		if (bmi > 25) {
			grade = "비만";
		} else if (bmi >= 23) {
			grade = "과체중";
		} else if (bmi >= 18.5) {
			grade = "표준";
		} else {
			grade = "저체중";
		}

		vo.setBmi(bmi);
		vo.setGrade(grade);

		return vo;
	}

	public void printBMI(BMIVO vo) {
		String strBMI = String.format("%.2f", vo.getBmi());
		System.out.println(
				vo.getName() + "\t" + vo.getHeight() + "\t" + vo.getWeight() + "\t" + strBMI + "\t" + vo.getGrade());
	}
}
