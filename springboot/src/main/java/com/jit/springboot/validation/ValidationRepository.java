package com.jit.springboot.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;





@Repository
public class ValidationRepository {

	static List<UserModel> userList = new ArrayList<>();

	public List<UserModel> getAllUsers() {
		return userList;
	}

	public UserModel getUser(int id) {
		UserModel first = userList.stream().filter(u -> u.getId() == id).findAny().get();
		return first;
	}

	public UserModel addUser(UserModel user) {
		userList.add(user);
		return user;
	}

	public UserModel updateUser(UserModel user) {
		for (UserModel ul : userList) {
			if (ul.getId() == user.getId()) {
				ul.setName(user.getName());
				ul.setEmail(user.getEmail());
				ul.setAddress(user.getAddress());

				return ul;
			}
		}
		return new UserModel();
	}

	public UserModel deleteUser(int id) {
		Optional<UserModel> first = userList.stream().filter(u -> u.getId() == id).findFirst();

		if (first.isPresent()) {
			UserModel user = first.get();
			userList.remove(user);
			return user;
		} else {
			return new UserModel();
		}
	}

}
