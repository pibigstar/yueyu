package com.pibigstar.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pibigstar.domain.enums.ExceptionMsg;
import com.pibigstar.domain.result.MyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 基础controller
 * @author pibigstar
 *
 */
@Controller
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	
	protected MyResponse success(String msg,Object data) {
		return new MyResponse(ExceptionMsg.SUCCESS.getCode(), msg, true, data);
	}
	protected MyResponse success(Object data) {
		return new MyResponse(ExceptionMsg.SUCCESS.getCode(),true, data);
	}
	
	protected MyResponse error(String code,String msg,Object data) {
		return new MyResponse(code,msg, false, data);
	}
	protected MyResponse error(String code,String msg) {
		return new MyResponse(code,msg, false);
	}
	
	

}
