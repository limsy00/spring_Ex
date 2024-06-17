package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.lesson03.domain.Review;

@Mapper
public interface ReviewMapper {
	// ●Ex01
	// input: int id
	// output: Review() or null 
	public Review selectReviewById(int id); 
	
	// ●Ex02
	public int insertReview(Review review);

	public int insertReviewAsField(
			@Param("storeId") int storeId, 
			@Param("menu") String menu, 
			@Param("userName") String userName, 
			@Param("point") Double point, 
			@Param("review") String review);

	// ●Ex03
	public int updateReviewById(
			@Param("id") int id, 
			@Param("review") String review);
}
