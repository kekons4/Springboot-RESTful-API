package com.example.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "users")
public class UserEntity {
	
	@Id
	@Column(name = "email_id")
	private String emailId;
	private String username;
	private String password;
	@Column(name = "last_login")
	private LocalDateTime lastLogin;
	@Column(name = "dob_of_acct")
	private LocalDateTime dobAcct;
	@Column(name = "last_username_change")
	private LocalDateTime lastUsername;
	@Column(name = "last_password_change")
	private LocalDateTime lastPassword;
	
	public String getEmailId() {
		return emailId;
	}
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
