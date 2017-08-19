package cn.xzwww.crm.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VelocityController {
	
	@RequestMapping(value = "/index", method = {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView regist(HttpServletRequest request, HttpServletResponse response){
		System.out.println("12312312323");
		return new  ModelAndView("main/index");
	}
	
	@RequestMapping("/user/login/{openId}")
	public String login(HttpServletRequest request, HttpServletResponse response, ModelMap map, @PathVariable(value="openId") String id){
		
		map.addAttribute("pageTitle", "用户登录-会员中心");
		map.addAttribute("openId", id);
		map.addAttribute("currentTime", new Date());
		
		return "main/user/login";
	}
	
}
