package com.pibigstar.domain.enums;

/**
 * 异常枚举
 * @author pibigstar
 *
 */
public enum ExceptionMsg {
	SUCCESS("0000","成功!"),
	ERROR("9999","失败!"),
	
	DEFAULT("500","系统内部错误"),
	;
	private String code;//异常状态码
	
	private String msg;//异常信息

	
	private ExceptionMsg(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
