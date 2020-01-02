package com.example.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.server.ResponseStatusException;

import com.example.model.Users;
import com.example.service.UsersService;
import com.fasterxml.jackson.databind.util.JSONPObject;

@CrossOrigin
@RestController
@RequestMapping("main")
public class api {
	
	@Autowired
	private UsersService us;

	@GetMapping(value = "test")
	public ResponseEntity<Users> test() throws Exception{
		try{
			Users user = new Users();
			user.setEmailId("ahsdfjhdf@yahoo.com");
			user.setUsername("kreios");
			user.setPassword("chichi");
			return new ResponseEntity<Users>(user, HttpStatus.OK);
		}
		catch(Exception e){
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}
	
	@PostMapping(value = "register")
	public ResponseEntity<String[]> register(@RequestBody Users users) throws Exception{
		try{
			String msg = us.registerNewAcct(users);
			String[] txt = new String[1];
			txt[0] = msg;
			return new ResponseEntity<String[]>(txt, HttpStatus.OK);
		} catch(Exception e){
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}
	@PostMapping(value = "login")
	public ResponseEntity<Users> login(@RequestBody Users users) throws Exception{
		try {
			Users user = us.login(users);
			return new ResponseEntity<Users>(user, HttpStatus.OK);
		} catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

}
