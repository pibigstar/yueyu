package com.pibigstar.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping(value = {"/index","/"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/info")
	public String info() {
		return "info";
	}
	@GetMapping("/duanzi")
	public String duanzi() {
		return "duanzi";
	}
	@GetMapping("/weimei")
	public String weimei() {
		return "weimei";
	}
	

}
