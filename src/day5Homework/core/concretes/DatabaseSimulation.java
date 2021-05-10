package day5Homework.core.concretes;

import java.util.ArrayList;

import day5Homework.entities.concretes.User;

public class DatabaseSimulation {
	
	public static ArrayList<User> userData() {
		
		ArrayList<User> users = new ArrayList<User>();
		
		User user1 = new User();
		user1.setFirstName("Özge Atmaca");
		user1.setMail("özgeatmaca@outlook.com");
		user1.setId(2);
		user1.setPassword("738238");
		users.add(user1);
		
		User user2 = new User();
		user2.setFirstName("Umut Coþkun");
		user2.setMail("umutcoþkun@outlook.com");
		user2.setId(3);
		user2.setPassword("8373893");
		users.add(user2);
		
		User user3 = new User();
		user3.setFirstName("þinasi");
		user3.setMail("þinasin@outlook.com");
		user3.setId(4);
		user3.setPassword("812374393");
		users.add(user3);
		
		return users;
	}
}
