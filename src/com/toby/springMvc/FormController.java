package com.toby.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class FormController {

	@RequestMapping("/input")
	public String input() {
		return "Input";
	}
	
	@RequestMapping("/process")
	public String processt(@RequestParam("StudentName") String studentName,Model model) {
		model.addAttribute("name", studentName);
		return "summary";
	}
}
