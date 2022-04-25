package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.Student;
import com.company.service.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@PostMapping("/createstudent")
	public Student saveStudent(@RequestBody Student params) {
		return studentServiceImpl.saveEntity(params);
	}

	@GetMapping(value = "/getallstudents")
	public List<Student> getAll() {
		return studentServiceImpl.getAllEntity();

	}

	@GetMapping(value = "/getOnlyOne/{mama}")
	public Student getAnEntity(@PathVariable int mama) {
		return studentServiceImpl.getAnEntity(mama);

	}

}
