package com.example.demo.admin.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.admin.manage.AdmManage;
import com.example.demo.admin.manage.AdmManageMapper;

@Controller
@RequestMapping("/admin")
public class LoginController {
	
	@Autowired
	AdmManageMapper admManageMapper;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@GetMapping(value = "/login")
	public String login() {
		return "admin/login";
	}
	
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		
		return "redirect:admin/login";
	}
	
	@RequestMapping(value = "/login/check",  produces = "application/json")
	@ResponseBody
	public String loginCheck(Model model, HttpSession session, HttpServletRequest request, AdmManage adm) throws Exception {
		
		AdmManage checkAdmin = admManageMapper.login(adm);
		String resultYN = "";
		
		if (checkAdmin != null) {
			resultYN = "Y";
			return resultYN;
		} else {
			resultYN = "N";
			return resultYN;
		}

	}

}
