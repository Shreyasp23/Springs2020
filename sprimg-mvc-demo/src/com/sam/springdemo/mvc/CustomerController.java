package com.sam.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {

		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	// Remove leading and trailing spaces ---------if space is entered it returns null
	@InitBinder
	public void returnString(WebDataBinder webBinder) {
		StringTrimmerEditor trimmer=new StringTrimmerEditor(true);
		webBinder.registerCustomEditor(String.class, trimmer);
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer cus,BindingResult theResult ,Model model) {
		
		if(theResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-confirm";
		}
		
		
		
	}

}
