package com.huayun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huayun.model.App;
import com.huayun.service.AppService;
import com.huayun.util.ObjectJsonUtils;

@Controller
public class AppController {

	@Autowired
	private AppService appService;
	
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<App> list = appService.findAll();
		model.addAttribute("list",list);
		return "app_list";
	}
	
	@RequestMapping(value = "/insertApp")
	public String insertApp(App app) {
		appService.addApp(app);
		return "redirect:/findAll";
	}
	
	@RequestMapping("/appInfo")
	public String appInfo(Long id,Model model) {
		App app = appService.findById(id);
		model.addAttribute("app", app);
		return "app_update";
	}
	
	@RequestMapping("/appUpdate")
	public String appUpdate(App app) {
		appService.appUpdate(app);
		return "redirect:/findAll";
	}
	
	@RequestMapping("/appDelete")
	public String appDelete(Long id) {
		appService.deleteById(id);
		return "redirect:/findAll";
	}
	
	
	@RequestMapping(value = "/findApp",produces = "text/html;charset=UTF-8")
//	@ResponseBody
	public String findApp(Long id,String name,Model model) {
		App app = appService.findById(id);
		model.addAttribute("appObj", app);
//		String json = ObjectJsonUtils.toJson(app);
		return "app_findapp";
	}
}
