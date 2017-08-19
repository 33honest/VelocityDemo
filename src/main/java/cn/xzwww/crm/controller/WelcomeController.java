package cn.xzwww.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class WelcomeController {
	
	@RequestMapping("welcome")
	@ResponseBody
	public String welcome(){
		
		return "Welcome";
	}
	
}
