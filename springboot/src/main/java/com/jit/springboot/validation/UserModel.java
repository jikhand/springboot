package com.jit.springboot.validation;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class UserModel {
	
	private int id;
	@NotNull(message = "It can not be null. Please provide no. in b/w 20 to 300")
	private String name;
	/**
	*@AddressValidation
	*/
	@AddressValidation(message = "Message not valid")
	private String address;
	@Email(message = "Email neaded")
	private String email;
    /**
     * Password must be between 4 and 8 digits long and include at least one numeric digit.
     */
    @Pattern(regexp = "^(?=.*\\d).{4,8}$")
	private String password;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
