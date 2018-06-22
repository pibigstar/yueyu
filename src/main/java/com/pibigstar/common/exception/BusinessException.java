package com.pibigstar.common.exception;

/**
 * 业务异常
 * @author pibigstar
 *
 */
public class BusinessException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessException(String message) {
		super(message);
	}

	
}
