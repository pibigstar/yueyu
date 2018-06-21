package com.pibigstar.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pibigstar.common.annotation.MyLogger;

@Controller
public class IndexController {
	
	@GetMapping(value = {"/index","/"})
	@MyLogger("index")
	public String index() {
		return "index";
	}
	
}
