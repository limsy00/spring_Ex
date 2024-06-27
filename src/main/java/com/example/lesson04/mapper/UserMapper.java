package com.example.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.lesson04.domain.User;

@Mapper
public interface UserMapper {
	public void insertUser(
			@Param("name") String name, 
			@Param("yyyymmdd") String yyyymmdd, 
			@Param("email") String email, 
			@Param("introduce") String introduce);
	
	public User selectLatestUser();
	
	// Lesson06Ex02Controller - AJAX로 아이디 중복확인 
	public boolean isDuplicationByName(String name); // 특수한 경우로, 이름 BO와 동일하게 설정 가능
}
