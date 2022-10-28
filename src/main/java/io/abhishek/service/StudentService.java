package io.abhishek.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.abhishek.model.Student;
import io.abhishek.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired private StudentRepo repo;
	
	private static Logger log = LoggerFactory.getLogger(StudentService.class);
	
	public Student addStudent(Student student) {
		log.debug("Adding student {}", student);
		return repo.save(student);
	}
	
	public List<Student> getStudents () {
		log.debug("getting students' list");
		return (List<Student>) repo.findAll();
	}

}
