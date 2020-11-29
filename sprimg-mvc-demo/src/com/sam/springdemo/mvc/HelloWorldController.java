package com.sam.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hellow")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "hellow-world-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "hellow-world-processed-form";
	}
	
	@RequestMapping("/toUpperMethod")
	public String processSecondForm(HttpServletRequest req, Model model ) {
		String formName = req.getParameter("studentName");
		String name = formName.toUpperCase();
		name= "Macha!! "+name;
		model.addAttribute("name", name);
		return "hellow-world-form";
	}
	
	@RequestMapping("/processFormThree")
	public String processFormThree(@RequestParam("studentName") String name, Model model) {
		
		name = name.toUpperCase();
		name= "Macha!! "+name;
		model.addAttribute("name", name);
		return "hellow-world-form";
	}
	
	@RequestMapping("/getCombinedName")
	public String getCombinedName(@ModelAttribute("student") Student s, Model model) {
		Student s1 =new Student();
		try {
		
		 String fullName = s.getFirstName() +" "+s.getLastName();
		 s1.setFullName(fullName);
		 s1.setCountry(s.getCountry());
		 s1.setLang(s.getLang());
		 s1.setOs(s.getOs());
		 s1.setLanguages(s.getLanguages());
		}catch(Exception e) {}
		
		
		
		model.addAttribute("student", s1);
		
		return "hellow-world-form";
	}

}
