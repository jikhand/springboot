package com.jit.springboot.validation;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/validation")
@Validated
public class ValidationController {
	@Autowired
	ValidationService validatonService;

	@GetMapping("/users")
	public List<UserModel> getValidationUsers() { return validatonService.getValidationUsers(); }
	
	@GetMapping("/user/{id}")
	public UserModel getValidationUser(@PathVariable @Min(100) int id) { return validatonService.getValidationUser(id); }
	
	@PostMapping("user")
	@ResponseStatus(HttpStatus.CREATED)
	public UserModel addValidastionUse(@Valid @RequestBody  UserModel user) {	return validatonService.addValidastionUse(user); }
	
	@PutMapping("user")
	public UserModel updateValidationUser(@RequestBody UserModel user) { return validatonService.updateValidationUser(user); }
	
	@DeleteMapping("/user/{id}")
	public UserModel deleteValidationUser(@PathVariable int id) { return validatonService.deleteValidationUser(id);}
}
