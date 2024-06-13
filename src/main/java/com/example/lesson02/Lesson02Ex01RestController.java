package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.bo.UsedGoodsBO;
import com.example.lesson02.domain.UsedGoods;

@RestController //  @Controller + @ResponseBody (JSON)
public class Lesson02Ex01RestController {
	// 필드
	@Autowired
	private UsedGoodsBO usedGoodsBO; // DI : spring bean 주입
	
	//http://localhost/lesson02/ex01
	@RequestMapping("/lesson02/ex01")
	public List<UsedGoods> ex01() { // 실제 db안에 table 이름(used_goods) ▶ 카멜 (UsedGoods)
		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList();
		return usedGoodsList; // list -> 결과적으론 Response JSON
	}
}
// ●ex02() : parameter X 재료 요청은 안해
// ●usedGoodsBO 먼저 실행해 -> 받아와서 -> 손님에게 응답
