package com.example.lesson02.bo;

import org.springframework.stereotype.Service;

@Service // spring bean 으로 등록하겠다.
public class UsedGoodsBO { // business Layer : @Controller 가 요청하는 업무
	// → input: X ( @Controller 로 부터 들어어온 요청 )
	
	// ← output: (Repository 한테 받은 것) List<UsedGoods> ▷ Controller 에게 줌
	
}
