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
		user1.setFirstName("�zge Atmaca");
		user1.setId(2);
		user1.setMail("�zgeatmaca@outlook.com");
		user1.setPassword("738238");
		
		User user2 = new User();
		user2.setFirstName("Umut Co�kun");
		user2.setId(3);
		user2.setMail("umutco�kun@outlook.com");
		user2.setPassword("");
		
		User falsePassword = new User();
		falsePassword.setFirstName("yanl�� mail");
		falsePassword.setId(4);
		falsePassword.setMail("yanl��mail@outlook.com");
		falsePassword.setPassword("1234");
		
		
		
		
	}

}
