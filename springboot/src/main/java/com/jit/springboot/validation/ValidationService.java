package com.jit.springboot.validation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidationService {

	@Autowired
	ValidationRepository validationRepository;

	public List<UserModel> getValidationUsers() {

		return validationRepository.getAllUsers();
	}

	public UserModel addValidastionUse(UserModel user) {

		return validationRepository.addUser(user);
	}

	public UserModel updateValidationUser(UserModel user) {

		return validationRepository.updateUser(user);
	}

	public UserModel deleteValidationUser(int id) {
		return validationRepository.deleteUser(id);
	}

	public UserModel getValidationUser(int id) {

		return validationRepository.getUser(id);
	}

}
