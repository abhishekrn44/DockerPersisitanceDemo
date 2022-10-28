package io.abhishek.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.abhishek.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {
	

}
