package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuestionController {

	@GetMapping("allQuestions")
	public String getQuestions() {
		
		return "This is the list of questions";
	}
}
