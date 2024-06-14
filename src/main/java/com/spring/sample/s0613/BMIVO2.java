package com.spring.sample.s0613;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BMIVO2 {
	private String name;
	private int height;
	private int weight;
	
	private double low;
	private double normal;
	private double high;
	
	private BMIService2 service = new BMIService2();
}
