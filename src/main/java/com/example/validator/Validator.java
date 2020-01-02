package com.example.validator;

import com.example.model.Users;

public class Validator {
	public static void validate(String emailId) throws Exception{
		if(!validateEmailId(emailId)){
			throw new Exception("Validator.USER_NOT_FOUND");
		}
	}
	
	public static Boolean validateEmailId(String emailId){
		if(emailId.length() >= 8){
			return true;
		} else{
			return false;
		}
	}
}
