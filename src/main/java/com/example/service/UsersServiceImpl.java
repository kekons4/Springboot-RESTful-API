package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UsersDAO;
import com.example.model.Users;
import com.example.validator.Validator;

@Service("UserService")
@Transactional
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersDAO usersDAO;
	
	@Override
	public String changePassword(Users user, String newPassword) throws Exception {
		Validator.validate(user.getEmailId());
		String result = usersDAO.changePassword(user.getEmailId(), newPassword);
		if(result.equals("User not found")){
			throw new Exception();
		} else{
			return result;
		}
	}

	@Override
	public String changeUsername(Users user, String newUsername) throws Exception {
		Validator.validate(user.getEmailId());
		String result = usersDAO.changeUsername(user.getEmailId(), newUsername);
		if(result.equals("User not found")){
			throw new Exception();
		} else{
			return result;
		}
	}

	@Override
	public String registerNewAcct(Users user) throws Exception {
		Validator.validate(user.getEmailId());
		String result = usersDAO.registerNewAcct(user);
		if(result.equals("User was not added")){
			throw new Exception();
		} else{
			return result;
		}
	}
	
	@Override
	public Users login(Users user) throws Exception {
		Validator.validate(user.getEmailId());
		Users result = usersDAO.login(user);
		if(result == null) {
			throw new Exception();
		} else {
			return result;
		}
	}

	@Override
	public String deleteAcct(String emailId) throws Exception {
		Validator.validate(emailId);
		return null;
	}

}
