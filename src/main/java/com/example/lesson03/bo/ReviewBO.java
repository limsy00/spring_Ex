package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.domain.Review;
import com.example.lesson03.mapper.ReviewMapper;

@Service
public class ReviewBO {
	// ● Ex01
	// ◎6 
	@Autowired
	private ReviewMapper reviewMapper;
	
	// ◎3
	public Review getReviewById(int id) {
		// ◎6-1
		// input : int id 받아 옴
		// output: Review(단건) or null → controller한테 전달 
		return reviewMapper.selectReviewById(id); // input 넘기기!
	}
	
	// ● Ex02
	// 1) input: Review, output: 성공한 행의 개수 (int)
	public int addReview(Review review) {
		return reviewMapper.insertReview(review);
	}
	/* ● 방법2
	 * public void addReview(Review review) { int count =
	 * reviewMapper.insertReview(review); }
	 */
	
	// 2) input : 4, "콤비네이션L", "바다", 4.5, "역시 도미노 맛도뤼~"
	public int addReviewAsField(int storeId, String menu, 
			String userName, Double point, String review) {
		return reviewMapper.insertReviewAsField(storeId, menu, userName, point, review);
	}
	
	// ● Ex03
	// input: id(where 조회 대상), review
	// output:  성공한 행 개수
	public int updateReviewById(int id, String review) {
		return reviewMapper.updateReviewById(id, review);
	}
 }
