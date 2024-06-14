package com.spring.sample.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// @Component
@Service
// @Component 처럼 우두머리로 어노테이션 해도 되지만 service, repository 등 상세히 지정해주는 것이 좋다
public class LogTestService {
	public void getLogTest1() {
		System.out.println();
		log.info("이 곳은 LogTestService 객체의 getLogTest1() 메소드 입니다.");
		System.out.println();
	}
}
