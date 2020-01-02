package com.example.dao;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Repository;

import com.example.entity.UserEntity;
import com.example.model.Users;
import com.example.utility.HashingUtility;

@Repository("UserDAO")
public class UsersDAOImpl implements UsersDAO{
	
	@Autowired
	private EntityManager em;
	
	@Override
	public String changePassword(String emailId, String password) {
		UserEntity ue = em.find(UserEntity.class, emailId);
		/*UserEntity test = new UserEntity();
		test.setPassword("Yeet");
		test.setUserId(1008);
		test.setUsername("Yeet");*/
		if(ue == null){
			return "User not found";
		} else{
			try {
				ue.setPassword(HashingUtility.getHashValue(password));
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ue.setLastPassword(LocalDateTime.now());
			em.persist(ue);
			//em.persist(test);
			return "User: " + emailId + " password has been changed.";
		}
	}

	@Override
	public String changeUsername(String emailId, String username) {
		UserEntity ue = em.find(UserEntity.class, emailId);
		if(ue == null){
			return "User not found";
		} else{
			ue.setUsername(username);
			ue.setLastUsername(LocalDateTime.now());
			em.persist(ue);
			return "User: " + emailId + " username has been changed.";
		}
	}

	@Override
	public String registerNewAcct(Users user) {
		UserEntity ue = new UserEntity();
		ue.setEmailId(user.getEmailId());
		ue.setUsername(user.getUsername());
		try {
			ue.setPassword(HashingUtility.getHashValue(user.getPassword()));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LocalDateTime now = LocalDateTime.now();
		ue.setDobAcct(now);
		ue.setLastLogin(now);
		em.persist(ue);
		UserEntity check = em.find(UserEntity.class, ue.getEmailId());
		if(check == null){
			return "User was not added";
		} else{
			return "User: " + user.getEmailId() + " has been registered!";
		}
	}

	@Override
	public Users login(Users user) {
		UserEntity ue = new UserEntity();
		ue.setEmailId(user.getEmailId());
		ue.setUsername(user.getUsername());
		try {
			ue.setPassword(HashingUtility.getHashValue(user.getPassword()));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user.setPassword(ue.getPassword());
		UserEntity check = em.find(UserEntity.class, ue.getEmailId());
		if(check != null) {
			if(check.getEmailId().equals(ue.getEmailId()) && check.getPassword().equals(ue.getPassword())) {
				user.setUsername(check.getUsername());
				user.setDobAcct(check.getDobAcct());
				user.setLastLogin(check.getLastLogin());
				return user;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

}
