package com.pibigstar.common.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pibigstar.common.annotation.MyLogger;

/**
 * 面向切面日志打印功能
 * @author pibigstar
 *
 */
@Aspect
@Service
public class MyLoggerAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("@annotation(myLogger)")
	public void printBeforeLog(MyLogger myLogger) {
		logger.info(myLogger.value()+"方法开始执行");
	}
	
	@After("@annotation(myLogger)")
	public void printAfterLog(MyLogger myLogger) {
		logger.info(myLogger.value()+"方法执行结束");
	}

	
	@AfterThrowing(pointcut = "@annotation(myLogger)",throwing = "e")
	public void printThrowingLog(MyLogger myLogger,Exception e) {
		logger.error(myLogger.value()+"执行异常",e);
	}
	
}
