package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// html 화면으로 보내는 controller
@Controller //★★ @ResponseBody가 있으면 안돼!!
public class Lesson02Ex02Controller {
	// http://localhost/lesson01/ex02
	@RequestMapping("/lesson01/ex02")
	public String ex02() { 
		// ( @ResponseBody가 없을 때) return 되는 String ▶ 경로
		
		// return "/templates/lesson01/ex02.html";
		// tymeleaf ▶ return "           lesson01/ex02";
		return "lesson01/ex02"; // response html view 경로
	}
}
