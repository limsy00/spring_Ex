package com.example.lesson02;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //  @Controller + @ResponseBody (JSON)
public class Lesson02Ex01RestController {
	//http://localhost/lesson02/ex01
	@RequestMapping("/lesson02/ex01")
	public List<UsedGoods> ex01() { // 실제 db안에 table 이름(used_goods) ▶ 카멜 (UsedGoods)
		
	}
}
