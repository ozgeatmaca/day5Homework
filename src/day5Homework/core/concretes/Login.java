package day5Homework.core.concretes;

import day5Homework.core.abstracts.LoginService;

public class Login implements LoginService {
	private String mail;
	private String password;
	
	public Login(String mail, String password) {
		this.mail = mail;
		this.password = password;
	}


	public void Login1(String mail2, String password2) {
		
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}