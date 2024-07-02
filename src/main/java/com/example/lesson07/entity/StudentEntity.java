package com.example.lesson07.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // 이 객체는 엔티티다. BO-JPA-DB
@Table(name="new_student") // 테이블 이름: StudentEntity(X), new_student(O)
@Getter
@Builder // setter 대신 많이 사용
// jpa는 반드시 2개의 생성자 필요
@NoArgsConstructor // (파라미터 X)기본 생성자
@AllArgsConstructor // (모든 파라미터 존재)생성자
@ToString // 객체 출력 시, 필드 값들이 보인다
public class StudentEntity {
	@Id // primary key 식별자 등록
	@GeneratedValue(strategy = GenerationType.IDENTITY) // insert 할 때 방금 들어간 id 가져옴
	private int id;
	
	private String name;
	
	@Column(name = "phoneNumber") // 변수이름이 camel case 일 때 사용하는 어노테이션
	private String phoneNumber;
	
	private String email;
	
	@Column(name = "dreamJob")
	private String dreamJob;
	
	@Column(name = "createdAt")
	@CreationTimestamp // 시간 값이 null 이어도 현재시간으로 돌아감, 업데이트시 변경X
	private LocalDateTime createdAt;
	
	@Column(name = "updatedAt")
	@UpdateTimestamp // 업데이트 시, 시간 변경
	private LocalDateTime updatedAt;

	
}
