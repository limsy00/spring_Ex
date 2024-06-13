package com.example.lesson02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.lesson02.domain.UsedGoods;

@Mapper
public interface UsedGoodsMapper {

	// interface : 구현X, 뼈대만
	// input: (BO로 부터 받아오는 것) parameter X
	// output : (BO에게 전달) List<UsedGoods>
	public List<UsedGoods> selectUsedGoodsList();
}
