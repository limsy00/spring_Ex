package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.domain.Review;
import com.example.lesson03.mapper.ReviewMapper;

@Service
public class ReviewBO {
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
 }
