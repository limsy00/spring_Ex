package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController // Spring bean 으로 등록
public class Lesson01Ex01RestController {
	// http://localhost:8080/lesson01/ex01/3
	@ResponseBody
	@RequestMapping("/3")
	public String ex01_3() { // ✅ return String ⇒ HTML
		return "<h3>@RestController을 사용하여 String을 return 한다.</h3>";
	}
	
	// http://localhost:8080/lesson01/ex01/4
	@ResponseBody
	@RequestMapping("/4")
	public Map<String, Object> ex01_4() {
		Map<String, Object> map = new HashMap<>();
		map.put("김바다", 111);
		map.put("신송이", 222);
		map.put("박진아", 1212);
		return map; // map → JSON
	}
	
	// http://localhost:8080/lesson01/ex01/5
	@ResponseBody
	@RequestMapping("/5")
	public Data ex01_5() { // ★Data(=내가 만든 객체) 클래스 생성해주기
		 Data data = new Data();
		 data.setId(100);
		 data.setName("임서영");
		return data;
	}
	
	// http://localhost:8080/lesson01/ex01/6
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		 Data data = new Data();
		 data.setId(100);
		 data.setName("임서영");
		return new ResponseEntity<Data>(data, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
