//package io.abhishek.model;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.Version;
//import org.springframework.data.mongodb.core.index.Indexed;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Document(collection = "employee")
//public class Employee {
//
//	@Id 
//	@Getter
//	@Setter
//	private String id;
//
//	@Getter
//	@Setter
//	@Version
//	private Integer version;
//
//	@Getter
//	@Setter
//	@Indexed(name = "employeeId", unique = true)
//	private int employeeId;
//
//	@Getter
//	@Setter
//	private String name;
//	
//	public Employee(int employeeId, String name) {
//		this.employeeId = employeeId;
//		this.name = name;
//	}
//}
