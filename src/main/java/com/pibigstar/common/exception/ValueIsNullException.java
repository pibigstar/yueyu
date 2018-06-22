package com.pibigstar.common.exception;

/**
 * 空值异常
 * @author pibigstar
 *
 */
public class ValueIsNullException extends BusinessException{

	private static final long serialVersionUID = 1L;

	public ValueIsNullException(String message, Throwable cause) {
		super(message, cause);
	}

	public ValueIsNullException(String message) {
		super(message);
	}
	
	

}
