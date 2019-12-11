package com.webproject.essuyo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpSession;

import com.webproject.essuyo.service.CompanyService;


@Controller
public class MainController {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/")
	public String showMainPage(Model model, HttpSession session) throws Exception {
		model.addAttribute("companyCount", companyService.getAllCompanyCount());
		model.addAttribute("rankCompanyList", companyService.getRankCompanyInfoList());
		session.setAttribute("test", "test");
		return "main";
	}
	
	@GetMapping("/test")
	public String goTest(Model model) throws Exception {
		
		return "test";
	}
	
}
