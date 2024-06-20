package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson04.domain.Student;

@RequestMapping("/lesson04/ex02")
@Controller
public class Lesson04Ex02Controller {
	
	@Autowired
	private StudentBO studentBO;
	
	// 학생 가입 화면
	@GetMapping("/add-student-view")
	public String addStudentView() {
		return "lesson04/addStudent";
	}
	
	// DB Insert => 방금 가입된 학생 select => 화면
	@PostMapping("/add-student")
	public String addStudent( Model model,
			@ModelAttribute Student student) { // @RequestParam 한번에 받아오는 방법
		
		// DB insert
		studentBO.addStudent(student);
		
		// DB select => 방금 가입된 1명의 학생
		int id = student.getId();
		Student latestStudent = studentBO.getStudentById(id);
		
		// 데이터 담을 Model 주머니
		model.addAttribute("student", latestStudent);
		
		// 화면 이동
		return "lesson04/afterAddStudent";
	}

}
