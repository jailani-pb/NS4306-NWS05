package com.nep.nws05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerClass {

	@RequestMapping(value = "/")
	@ResponseBody
	public String index() {
		return "<h2>This is my home page</h2>";
	}
	
	@RequestMapping(value = "/contact")
	@ResponseBody
	public String contact() {
		return "<h2>Jailani Abdul Rahman</h2>" +
				"<p>School of ICT</p>" +
				"<p>jailani.rahman@pb.edu.bn</p>";
	}
	
	@RequestMapping(value = "/message/{msg}")
	@ResponseBody
	public String message(@PathVariable String msg) {
		return "<h2>" + msg + "</h2>";
	}
	
	@RequestMapping(value = "/search")
	@ResponseBody
	public String search(
			@RequestParam(required=true) String name,
			@RequestParam(required=true) String age) {
		return "<h1>" + name + " (" + age + ") </h1>";
	}
	
}





