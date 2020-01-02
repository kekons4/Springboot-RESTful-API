package com.example.service;

import com.example.model.Users;

public interface UsersService {
	public String changePassword(Users user, String newPassword) throws Exception;
	public String changeUsername(Users user, String newUsername)throws Exception;
	public String registerNewAcct(Users user) throws Exception;
	public String deleteAcct(String emailId) throws Exception;
	public Users login(Users user) throws Exception;
}
