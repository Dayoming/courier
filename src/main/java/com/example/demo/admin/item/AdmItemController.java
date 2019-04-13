package com.example.demo.admin.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.sample.OverseasInfo;
import com.example.demo.sample.OverseasInfoMapper;

@Controller
@RequestMapping("/admin/item")
public class AdmItemController {
	
	@Autowired
	AdmItemMapper admItemMapper;
	
	@Autowired
	OverseasInfoMapper overseasMapper;

	@RequestMapping(value = "/list", produces = "application/json")
	@ResponseBody
	public List<AdmItem> list(Model model) {
		List<AdmItem> entity = admItemMapper.list();
		System.out.println(entity);
		model.addAttribute("list", entity);
		return entity;
	}
	
	@GetMapping(value="/add", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String add(Model model, AdmItem admItem) {
		admItemMapper.insert(admItem);
		overseasMapper.insert(admItem);
		return "";
	}
	
	@GetMapping(value="/delete", produces = "application/json")
	@ResponseBody
	public String delete(Model model, @RequestParam String itemId) {
		admItemMapper.delete(itemId);
		return "";
	}
	
	@GetMapping(value="/searchId", produces = "application/json")
	@ResponseBody
	public AdmItem searchId(Model model, @RequestParam String itemId) {
		AdmItem entity = admItemMapper.getById(itemId);
		return entity;
	}
	
	@GetMapping(value="/update", produces = "application/json")
	@ResponseBody
	public String update(Model model, AdmItem admItem) {
		admItemMapper.update(admItem);
		OverseasInfo over = overseasMapper.getByItem(admItem);
		if (over == null) {
			overseasMapper.insert(admItem);
		} else {
			overseasMapper.update(admItem);
		}
		return "";
	}
	
	
	@GetMapping(value = "/")
	public String view(Model model) {
		return "admin/item/item_list";
	}
}
