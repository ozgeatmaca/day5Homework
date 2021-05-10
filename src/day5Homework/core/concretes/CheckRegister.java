package day5Homework.core.concretes;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5Homework.entities.concretes.User;

public class CheckRegister {
	
	public boolean checkMail(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher marcher = pattern.matcher(user.getMail());
		
		if(marcher.matches()) {
			return checkName(user);
		} else {
			System.out.println("Mailinizi kontrol ediniz.");
			return false;
		}
	}
	
	public boolean checkName(User user) {
		if(user.getFirstName().length() < 2 ) {
			System.out.println("Adýnýz en az 2 karakterden oluþmalýdýr.");
			return false;
		} else {
			return checkPassword(user);
		}
	}
	
	
	public boolean checkPassword(User user) {
		if(user.getPassword().length() < 6) {
			System.out.println("Parola 6 karakter olmalýdýr.");
			return false;
		} else {
			return checkDatabase(user);
		}
	}
	
	public boolean checkDatabase(User user) {
		for (User userCheck : DatabaseSimulation.userData()) {
			if (user.getMail().equals(userCheck.getMail())) {
				System.out.println("Girdiðiniz mail sistemde kayýtlýdýr. : "+user.getMail());
				return false;
			}
		}
		return true;
	}
	
}