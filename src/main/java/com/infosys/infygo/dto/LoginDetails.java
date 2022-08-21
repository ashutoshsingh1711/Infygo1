package com.infosys.infygo.dto;
import javax.validation.constraints.NotEmpty;

public class LoginDetails {
	@NotEmpty(message = "Please enter your userid")
	private String userId;

	@NotEmpty(message = "Please enter your password.")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
