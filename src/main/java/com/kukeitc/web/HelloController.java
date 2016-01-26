package com.kukeitc.web;

import org.junit.runner.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class HelloController {

	@RequestMapping(method=RequestMethod.GET)
	public String index(){
		return "login_view";
	}
}
