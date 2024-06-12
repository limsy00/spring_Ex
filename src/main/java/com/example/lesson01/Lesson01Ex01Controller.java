package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01") // ● 클래스에 위치한 매핑이 먼저 읽힘 (공통 주소까지만 빼주기)
@Controller // Spring bean 으로 등록
public class Lesson01Ex01Controller {
	
	/* 어느 주소로 들어올 때 주소가 맴핑 되는가?  
	 * → http://localhost:8080/lesson01/ex01/1 */
	
	@ResponseBody // ✅return 되는 값이 Response Body에 넣어짐 ⇒ HTML 응답
	//@RequestMapping("/lesson01/ex01/1")
	@RequestMapping("/1")
	public String ex01_1() {
		return "<h2>문자열을 Response Body에 보내는 예제</h2>";
	}
	
	/* http://localhost:8080/lesson01/ex01/2  
	 * ✅Map return ⇒ JSON 변환
	 * : spring web starter 라이브러리에 jackson 라이브러리가 포함되어 있기 때문 */

	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> ex01_2() { // ● 옛날 방식
		Map<String, Object> map = new HashMap<>();
		map.put("복숭아", 20);
		map.put("파인애플", 105);
		map.put("메론", 6);
		map.put("망고", 86);
		return map;
	}
	
}
