package com.example.lesson04.bo;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.domain.Student;
import com.example.lesson04.mapper.StudentMapper;
import com.example.lesson07.entity.StudentEntity;
import com.example.lesson07.repository.StudentRepository;

@Service
public class StudentBO {

	@Autowired
	private StudentMapper studentMapper;
	
	
	@Autowired // ● Lesson07Ex01RestController
	private StudentRepository studentRepository; 
	
	// input: Student
	// output: X
	public void addStudent(Student student) {
		studentMapper.insertStudent(student);
	}
	
	// input: id
	// output: Student
	public Student getStudentById(int id) {
		return studentMapper.selectStudentById(id);
	}
	
	// ● Lesson07Ex01RestController -> 오버라이딩★★★
	// input: name, email, phoneNumber, dreamJob
	// output: StudentEntity (방금 들어간 Student 단건 리턴)
	public StudentEntity addStudent(String name, String phoneNumber, String email, String dreamJob) {
		StudentEntity student = StudentEntity.builder()
				.name(name)
				.phoneNumber(phoneNumber)
				.email(email)
				.dreamJob(dreamJob)
				//.createdAt(LocalDateTime.now()) -> @CreationTimestamp 있으면 생략 가능
				.build();
		return studentRepository.save(student);
	}
}
