package com.wipro.demosprmysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.demosprmysql.entity.Student;
import com.wipro.demosprmysql.service.StudentService;

@RestController
public class StudentRestController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@GetMapping("/getAll")
	public List<Student> getAllStudents() {

		return studentService.getAllStudents();
	}

}
