package com.pibigstar.common.exception;

/**
 * 没有权限异常
 * @author pibigstar
 *
 */
public class NoPermissionException extends BusinessException{

	private static final long serialVersionUID = 1L;

	public NoPermissionException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoPermissionException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
