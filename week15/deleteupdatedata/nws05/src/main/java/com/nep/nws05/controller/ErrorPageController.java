package com.nep.nws05.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorPageController implements ErrorController {

	private static final String PATH = "/error";

	@RequestMapping(value = PATH)
	@ResponseBody
	public String error(HttpServletRequest httpRequest) {
		String errorMsg = "";
		int errorCode = (int) httpRequest.getAttribute("javax.servlet.error.status_code");

		switch (errorCode) {
			case 400: {
				errorMsg = "Http Error Code: 400. Bad Request";
				break;
			}
			case 404: {
				errorMsg = "Http Error Code: 404. Resource not found";
				break;
			}
			case 500: {
				errorMsg = "Http Error Code: 500. Internal Server Error";
				break;
			}
			default: {
				errorMsg = "Unknown Error!";
				break;
			}
		}

		return errorMsg;
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}

}






