package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.model.TraineeDetails;
import com.service.TraineeService;

@RestController
public class MyController {
	@Autowired
	TraineeService traineeService;   // service class object
	int id;
	
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	
	@PostMapping("/register")
	public ResponseEntity register(@RequestBody TraineeDetails traineeDetails) {
		traineeService.register(traineeDetails);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/login")
	public void login(@RequestBody TraineeDetails traineeDetails) {
		id=traineeService.login(traineeDetails);
	}
	@PostMapping("/add")
	public ResponseEntity insertData(@RequestBody TraineeDetails trainee) {
		traineeService.addTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity deleteData(@RequestBody int id) {
		traineeService.deleteTrainee(id);
		return new ResponseEntity(HttpStatus.OK);
		
	}
}
