package com.spring.sample.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.sample.service.LogTestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired // IoC 컨테이너 스캔, 접근제한자는 private이나 default만씀
	LogTestService logTestService; // 스캔을 위해 선언
	
	// @RequestMapping(value = "/", method = RequestMethod.GET)
	@RequestMapping(value = { "/", "/home", "/index", "/main", "/h" }, method = RequestMethod.GET)
	public String home(Locale locale, Model model, String msg) {
		logger.info("Welcome home! The client locale is {}.", locale);
		// logger.debug("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("msg", msg);

		return "home";
	}

	/*
	 * log level 5가지 계층도 : trace -> debug -> info -> warn -> error
	 */
	@RequestMapping(value = "/logTest", method = RequestMethod.GET)
	public String getLogTest(Model model) {
		Date today = new Date();

		System.out.println();
		logger.info("Logger 객체를 이용한 출력");
		logger.trace("trace : {}", today);
		logger.debug("debug : {}", today);
		logger.info("info : {}", today);
		logger.warn("warn : {}", today);
		logger.error("error : {}", today);

		System.out.println();
		log.info("롬복 라이브러리(@Sl4fj)를 이용한 출력");
		log.trace("trace : {}", today);
		log.debug("debug : {}", today);
		log.info("info : {}", today);
		log.warn("warn : {}", today);
		log.error("error : {}", today);

		// 서비스 객체 호출하여 로그 찍어보기
		// LogTestService logTest = new LogTestService();
		// logTest.getLogTest1();
			
		logTestService.getLogTest1();
		
		model.addAttribute("msg", "로그 파일을 출력합니다. 콘솔창을 확인하세요.");

		return "redirect:/";
		// 루트로 가도록 처리
	}
}