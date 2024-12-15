package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Student;

@Controller
public class HomeController {
 
	@RequestMapping(value="/")
	 public String landingPage()
	 {
		 return "index";
	 }
	@RequestMapping(value="/log")
	 public String logPage()
	 {
		 return "login";
	 }
	@RequestMapping(value="/login")
	public String loginPage(@RequestParam String uname,@RequestParam String pwd,Model m)
	{
		if(uname.equalsIgnoreCase("cjc")&&pwd.equals("cjc123"))
		{
			System.out.println("Login successfully...");
			System.out.println("user name:"+uname+" "+"Password: "+pwd);
			m.addAttribute("uname",uname);
			m.addAttribute("pwd",pwd);
			
			return "success";
		}
		return "index";
	}
	@RequestMapping(value="/reg")
	 public String regPage()
	 {
		 return "register";
	 }
	@RequestMapping(value="/register")
	 public String registerPage(@ModelAttribute Student stud,Model m)
	 {
		System.out.println("Student details:");
		System.out.println(stud.getRollno());
		System.out.println(stud.getName());
		System.out.println(stud.getUname());
		System.out.println(stud.getMobileno());
		System.out.println(stud.getEmailid());
		System.out.println(stud.getPass());
		
		m.addAttribute("data",stud);
		 return "registersuccess";
	 }
	
	
}
