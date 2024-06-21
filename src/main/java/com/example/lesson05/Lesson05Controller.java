package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lesson05")
public class Lesson05Controller {

	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		// List<String>
		List<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("복숭아");
		fruits.add("포도");
		fruits.add("망고");
		fruits.add("딸기");
		model.addAttribute("fruits", fruits);
		
		// List<Map<String, Object>>
		List<Map<String, Object>> users = new ArrayList<>(); // List 비어있는 상태
		
		Map<String, Object> user = new HashMap<>();  // 사람(객체) 1명 생성
		user.put("name", "김바다");
		user.put("age", 25);
		user.put("hobby", "영화보기");
		users.add(user);
		
		user = new HashMap<>(); // 또 다른 1명 추가 
		user.put("name", "윤태양");
		user.put("age", 21);
		user.put("hobby", "축구");
		users.add(user);
		
		model.addAttribute("users", users); // -> 총 2명 model에 담기
		
		return "lesson05/ex02";
	}
}
