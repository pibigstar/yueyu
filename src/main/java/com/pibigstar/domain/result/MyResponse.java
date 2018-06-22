package com.pibigstar.domain.result;

import com.pibigstar.domain.enums.ExceptionMsg;

/**
 * 返回结果对象
 * @author pibigstar
 *
 */
public class MyResponse {
	
	private String code = "0000";
	
	private String msg;
	
	private boolean success;
	
	private Object data;

	
	
	public MyResponse(String code, String msg, boolean success, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.success = success;
		this.data = data;
	}
	

	public MyResponse(String code, boolean success, Object data) {
		super();
		this.code = code;
		this.success = success;
		this.data = data;
	}

	public MyResponse(boolean success, Object data) {
		super();
		this.success = success;
		this.data = data;
	}


	public MyResponse(String code, String msg, boolean success) {
		super();
		this.code = code;
		this.msg = msg;
		this.success = success;
	}


	public MyResponse(Exception e) {
		super();
		this.code = "500";
		this.msg = e.getMessage();
		this.success = false;
	}
	public MyResponse(ExceptionMsg e) {
		super();
		this.code = e.getCode();
		this.msg = e.getMsg();
		this.success = false;
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

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}


	public Object getData() {
		return data;
	}


	public void setData(Object data) {
		this.data = data;
	}
	

}
