package com.example.demo.admin.manage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin/manage")
public class AdmManageController {
	
	@Autowired
	AdmManageMapper admManageMapper;
	
	
	@RequestMapping(value = "/list", produces = "application/json")
	@ResponseBody
	public List<AdmManage> list(Model model) {
		List<AdmManage> entity = admManageMapper.list();
		System.out.println(entity);
		model.addAttribute("list", entity);
		return entity;
	}
	
	@GetMapping(value="/add", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String add(Model model,
					  AdmManage admManage) {
//		String hashedPw = BCrypt.hashpw(admManage.getAdminPw(), BCrypt.gensalt());
//		admManage.setAdminPw(hashedPw);
//		
		admManageMapper.insert(admManage);
		return "";
	}
	
	@GetMapping(value="/delete", produces = "application/json")
	@ResponseBody
	public String delete(@RequestParam String id) {
		admManageMapper.delete(id);
		return "";
	}
	
	@GetMapping(value="/searchId", produces = "application/json")
	@ResponseBody
	public AdmManage searchId(@RequestParam String id) {
		AdmManage entity = admManageMapper.getById(id);
		return entity;
	}
	
	@GetMapping(value="/update", produces = "application/json")
	@ResponseBody
	public String update(Model model, AdmManage admManage) {
		admManageMapper.update(admManage);
		return "";
	}
	
	@GetMapping("/")
	public String view(Model model) {
		return "admin/manage/admin_list";
	}
}
