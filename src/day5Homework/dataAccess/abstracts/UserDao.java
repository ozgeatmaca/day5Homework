package day5Homework.dataAccess.abstracts;

import day5Homework.entities.concretes.User;

public interface UserDao {
	
	void add(User user);

	void add1(User user);

	void open(User user);

}
