package com.bridgelab.employeepayrollapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bridgelab.employeepayrollapp.dto.EmployeePayrollDTO;

@Controller
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

	@GetMapping(value = { "", "/", "/get" })
	public ResponseEntity<String> getEmployee() {
		return new ResponseEntity<String>("Get call success", HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<String> getEmployeeById(@PathVariable("id") int id) {
		return new ResponseEntity<String>("Get call success for id : " + id, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<String> addEmployee(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
		return new ResponseEntity<String>("Added a new emp data for : " + employeePayrollDTO, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody EmployeePayrollDTO empPayrollDTO) {
		return new ResponseEntity<String>("Updated data of employee for : " + empPayrollDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id) {
		return new ResponseEntity<String>("Deleted data of employee Id : " + id, HttpStatus.OK);
	}
}
