package com.spring.sample.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
@Aspect
public class AspectTest {
//	// Advice
//	@Around("execution(* com.spring.sample.service.AopService.getAopServiceTest1(..))") 
//	// PointCut 설정 (사용 범위 설정 : ("execution(타입 패키지명.클래스명.메소드명(매개변수))")) 타입이 *이면 와일드카드, 매개변수가 없을 때는 ..을 써주기
//	public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
//		System.out.println("\n이 곳은 aroundAdvice 메소드 전 입니다. : " + joinPoint);
//		
//		joinPoint.proceed();
//		
//		System.out.println("\n이 곳은 aroundAdvice 메소드 후 입니다. : " + joinPoint);
//	}
//	
//	@Before("execution(* com.spring.sample.service.AopService.getAopServiceTest1(..))") 
//	public void beforeAdvice(JoinPoint joinPoint) throws Throwable {
//		
//		System.out.println("\n이 곳은 beforeAdvice 메소드입니다.");
//	}
//	
//	@AfterReturning("execution(* com.spring.sample.service.AopService.getAopServiceTest1(..))") 
//	public void afterAdvice(JoinPoint joinPoint) throws Throwable {
//		
//		System.out.println("\n이 곳은 afterAdvice 메소드입니다.");
//	}

//	@Pointcut("execution(* com.spring.sample.service.AopService.getAopServiceTest1(..))")
//	private void cut() {
//	}
//
//	@Before("cut()")
//	public void beforeAdvice(JoinPoint joinPoint) throws Throwable {
//
//		System.out.println("\n이 곳은 beforeAdvice 메소드입니다. : " + joinPoint);
//	}
//
//	@AfterReturning("cut()")
//	public void afterAdvice(JoinPoint joinPoint) throws Throwable {
//
//		System.out.println("\n이 곳은 afterAdvice 메소드입니다.");
//	}

//	@Around("execution(* com.spring.sample.service.AopService.getAopServiceTest*(..))")
//	public void aroundAdvice() {
//		System.out.println("\n이 곳은 aroundAdvice 메소드입니다.");
//	}
	
	@Pointcut("execution(* com.spring.sample.service.AopService.getAopServiceTest2(..))")
	private void cut() {
	}
	
	@AfterReturning(value = "cut()", returning = "obj")
	public void aroundAdvice(Object obj) {
		System.out.println("\n이 곳은 @AfterReturningAdvice 메소드입니다. : obj = " + obj);
	}

	// @Around("execution(* com.spring.sample.service.AopService..*.*(..))")
//	@Around("execution(* com.spring.sample.service.AopService.getAopServiceTest*(..))")
//	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
//		System.out.println("\n이 곳은 aroundAdvice 메소드입니다.");
//
//		long startTime = System.nanoTime();
//		try {
//			Object result = joinPoint.proceed();
//			return result;
//		} finally {
//			long endTime = System.nanoTime();
//			long executionTime = endTime - startTime;
//
//			System.out.println("수행 시간 : " + executionTime + "ns");
//		}
//	}
}
