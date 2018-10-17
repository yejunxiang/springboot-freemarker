package com.example.demo.aoptest;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 实现web层的日志切面
 * 
 * @author yejunxiang
 * @date 2018年10月17日
 * 
 *       使用@Aspect注解将一个java类定义为切面类
 *       使用@Pointcut定义一个切入点，可以是一个规则表达式，比如下例中某个package下的所有函数，也可以是一个注解等。
 *       根据需要在切入点不同位置的切入内容 使用@Before在切入点开始处切入内容 使用@After在切入点结尾处切入内容
 *       使用@AfterReturning在切入点return内容之后切入内容（可以用来对处理返回值做一些加工处理）
 *       使用@Around在切入点前后切入内容，并自己控制何时执行切入点自身的内容
 *       使用@AfterThrowing用来处理当切入内容部分抛出异常之后的处理逻辑
 * 
 */
@Aspect // 将该类定义为切面类
@Component
public class WebLogAspect {

	// 定义一个切入点为com.example.demo.aoptest包及其子包下的所有类的所有方法(对该包下的所有请求做切入点)
	@Pointcut("execution(* com.example.demo.aoptest..*.*(..))")
	public void weblog() {

	}

	// 切入点开始处切入内容
	@Before("weblog()")
	public void doBefore(JoinPoint joinpoint) {
		// 接收到请求，记录请求内容
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

		HttpServletRequest request = attributes.getRequest();

		System.out.println("url: " + request.getRequestURI().toString());
		System.out.println("http-method: " + request.getMethod());
		System.out.println("ip: " + request.getRemoteHost());
		System.out.println("method-name: " + joinpoint.getSignature().getDeclaringTypeName() + "."
				+ joinpoint.getSignature().getName());
		System.out.println("args: " + Arrays.toString(joinpoint.getArgs()));

	}

	// return之后切入内容
	@AfterReturning(returning = "ret", pointcut = "weblog()")
	public void doAfterReturning(Object ret) {
		System.out.println("response: " + ret);
	}
}
