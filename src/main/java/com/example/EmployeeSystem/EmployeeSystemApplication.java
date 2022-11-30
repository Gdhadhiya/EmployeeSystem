package com.example.EmployeeSystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmployeeSystemApplication {

	@Autowired
	EmployeeRepo repository;

	@PostMapping("/save")
	public void saveEmployee(@RequestBody EmployeeData emp) {
		repository.save(emp);
	}

	@GetMapping("/getemployee")
	public List<EmployeeData> getEmployee() {
		return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSystemApplication.class, args);
	}

}
