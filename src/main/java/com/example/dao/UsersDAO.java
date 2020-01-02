package com.example.dao;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.example.model.Users;

public interface UsersDAO {
	public String changePassword(String emailId, String password);
	public String changeUsername(String emailId, String username);
	public String registerNewAcct(Users user);
	public Users login(Users user);
}
