package com.pibigstar.common.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.pibigstar.common.exception.BusinessException;
import com.pibigstar.domain.result.MyResponse;

/**
 * 全局异常捕获
 * @author pibigstar
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 处理本系统的所以业务逻辑异常
	 * @param e
	 * @return
	 * @throws BusinessException
	 */
	@ExceptionHandler(BusinessException.class)
	@ResponseBody
	public MyResponse handleBusinessException(BusinessException e) throws BusinessException{
		logger.error(e.getMessage(),e);
		//TODO  跳转到业务异常 网页显示
		return new MyResponse(e);
	}
	/**
	 * 处理所有未知异常
	 * @param e
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public MyResponse handleException(Exception e) {
		logger.error(e.getMessage(),e);
		return new MyResponse(e);
	}
	
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public String handle404() {
		return "404";
	}
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public String handle500() {
		return "500";
	}

}
