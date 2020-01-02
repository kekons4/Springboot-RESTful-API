package com.example.model;

import java.time.LocalDateTime;

import javax.persistence.Column;

public class Users {
	private String emailId;
	private String username;
	private String password;
	private LocalDateTime lastLogin;
	private LocalDateTime dobAcct;
	private LocalDateTime lastUsername;
	
	public LocalDateTime getDobAcct() {
		return dobAcct;
	}
	public void setDobAcct(LocalDateTime dobAcct) {
		this.dobAcct = dobAcct;
	}
	public LocalDateTime getLastUsername() {
		return lastUsername;
	}
	public void setLastUsername(LocalDateTime lastUsername) {
		this.lastUsername = lastUsername;
	}
	public LocalDateTime getLastPassword() {
		return lastPassword;
	}
	public void setLastPassword(LocalDateTime lastPassword) {
		this.lastPassword = lastPassword;
	}
	private LocalDateTime lastPassword;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}
}
