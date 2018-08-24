package com.wunian.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wunian.entity.UserInfo;
import com.wunian.service.UserInfoService;
/**
 * Userøÿ÷∆¿‡
 * @author Administrator
 *
 */
@Controller
public class UserController {

	@Resource
	private UserInfoService userInfoService;
	
	@RequestMapping("/findUser")     
	public String findUser(Model model) {
			int id=1234567890;
			UserInfo userInfo=userInfoService.findUserById(id);
			model.addAttribute("user", userInfo);
			return "index";
	}
}
