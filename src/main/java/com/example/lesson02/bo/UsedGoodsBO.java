package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;
import com.example.lesson02.mapper.UsedGoodsMapper;

@Service // spring bean 으로 등록하겠다.
public class UsedGoodsBO { // business Layer : @Controller 가 요청하는 업무
	// 필드
	@Autowired // ✅@Autowired 를 통해 spring bean 을 가져온다.(new X) → DI
	private UsedGoodsMapper usedGoodsMapper; // ●객체 이름은 소문자로
	
	// → input: X ( @Controller 로 부터 들어어온 요청 )
	
	/* ← output: (Repository 한테 받은 것) ▶ (Controller 에게 반환) 
	 * 			   selectUsedGoodsList() ▶ List<UsedGoods> */			   
	public List<UsedGoods> getUsedGoodsList() {
		
		//List<UsedGoods> usedGoodsList = usedGoodsMapper.selectUsedGoodsList();
		//return usedGoodsList; 
		return usedGoodsMapper.selectUsedGoodsList(); // controller에게 반환
	}
}
