package day5Homework;


import day5Homework.business.concretes.UserManager;
import day5Homework.core.concretes.CheckRegister;
import day5Homework.core.concretes.Login;
import day5Homework.core.concretes.SendMail;
import day5Homework.dataAccess.concretes.DatabaseLoginDao;
import day5Homework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setFirstName("Özge Atmaca");
		user1.setId(2);
		user1.setMail("özgeatmaca@outlook.com");
		user1.setPassword("738238");
		
		User user2 = new User();
		user2.setFirstName("Umut Coþkun");
		user2.setId(3);
		user2.setMail("umutcoþkun@outlook.com");
		user2.setPassword("");
		
		User falsePassword = new User();
		falsePassword.setFirstName("yanlýþ mail");
		falsePassword.setId(4);
		falsePassword.setMail("yanlýþmail@outlook.com");
		falsePassword.setPassword("1234");
		
		
		
		
	}

}
