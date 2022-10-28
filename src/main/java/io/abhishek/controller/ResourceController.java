package io.abhishek.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.abhishek.model.Student;
import io.abhishek.service.StudentService;

@RestController
public class ResourceController {

	@Autowired
	StudentService service;

	private static Logger log = LoggerFactory.getLogger(ResourceController.class);
	
//	@Autowired
//	StudentMapper mapper;

	@GetMapping("/add")
	public Student addStudent(@RequestParam(name = "id") int id, @RequestParam(name = "name") String name) {
		log.debug("Student id is {} and Name is {}", id, name);
		Student student =  service.addStudent(new Student(id, name));
		log.debug("Student's ID is {} and name is {}", id,name);
		return student;
	}

	@GetMapping("/show")
	public List<Student> getStudentList() {
		log.debug("Controller hit, getting list of Student");
		List<Student> studentsList =  service.getStudents();
		studentsList.stream().map(s->s.getName()).forEach(log::debug);
		return studentsList;
	}
	
	@GetMapping("/")
	public String greet() {
		return "Welcome";
	}

//	@GetMapping("/showbyId")
//	public List<Student> getStudent(@RequestParam(name = "id") int empId) {
//		log.debug("Student id is {}", empId);
//		return service.findByStudentId(empId);
//	}
//
//	@DeleteMapping("/deletebyId")
//	public void deleteStudent(@RequestParam(name = "id") int StudentId) {
//		log.debug(" Deleting Student by ID {}", StudentId);
//		service.deletebyStudentId(StudentId);
//		log.debug("Student by ID {} deleted", StudentId);
//	}

}