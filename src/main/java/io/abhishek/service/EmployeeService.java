//package io.abhishek.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import io.abhishek.model.Employee;
//import io.abhishek.repo.EmployeeRepo;
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@Service
//public class EmployeeService {
//
//	@Autowired
//	private EmployeeRepo employeeRepo;
//
//	public Employee save(Employee employee) {
//		log.debug("Employee {}", employee);
//		return employeeRepo.save(employee);
//	}
//
//	public List<Employee> findAll() {
//		return (List<Employee>) employeeRepo.findAll();
//	}
//
//	public List<Employee> findByEmployeeId(int employeeId) {
//		return employeeRepo.findByEmployeeId(employeeId);
//	}
//	
//	public void deletebyEmployeeId(int id) {
//		employeeRepo.deleteByEmployeeId(id).ifPresent(e -> employeeRepo.delete(e));
//	}
//	
//}
