package com.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.example.model.Users;
import com.example.service.UsersService;

@SpringBootApplication
@ComponentScan(basePackages="com.example")
public class DopeApplication {
	/*
	@Autowired
	private UsersService userService;
	
	@Autowired
	private Environment environment;
	*/
	public static void main(String[] args) {
		SpringApplication.run(DopeApplication.class, args);
	}
/*
	@Override
	public void run(String... args) throws Exception {
		//changeUsername();
		//changePassword();
		//registerNewAcct();
	}
	
	public void changeUsername(){
		Users user = new Users();
		user.setEmailId("kekons4@gmail.com");
		String newUsername = "kreios";
		try {
			userService.changeUsername(user, newUsername);
			System.out.println("Success!! the username has been changed");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public void changePassword(){
		Users user = new Users();
		user.setEmailId("tpour@gmail.com");
		String newPassword = "pourboghrat";
		try {
			userService.changePassword(user, newPassword);
			System.out.println("Success!! the password has been changed");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public void registerNewAcct(){
		Users user = new Users();
		user.setEmailId("kekons4@gmail.com");
		user.setUsername("kreios");
		user.setPassword("password");
		try{
			userService.registerNewAcct(user);
			System.out.println("Success!! the account has been registered");
		} catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public  void deleteAcct(){
		String emailId = "kekons4@gmail.com";
		try{
			userService.deleteAcct(emailId);
			System.out.println("Success!! the account has been deleted");
		} catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

*/

}

