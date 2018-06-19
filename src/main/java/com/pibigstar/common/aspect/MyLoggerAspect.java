package com.pibigstar.common.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.pibigstar.common.annotation.MyLogger;

/**
 * 面向切面日志打印功能
 * @author pibigstar
 *
 */
@Aspect
@Component
public class MyLoggerAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("@annotation(myLogger)")
	public void printBefore(MyLogger myLogger) {
		logger.info(myLogger.description()+"方法开始执行");
	}
	
	@After("@annotation(myLogger)")
	public void printAfter(MyLogger myLogger) {
		logger.info(myLogger.description()+"方法执行结束");
	}

	
	@AfterThrowing("@annotation(myLogger)")
	public void printThrowing(MyLogger myLogger,Exception e) {
		logger.error(myLogger.description()+"执行异常",e);
	}
	
}
