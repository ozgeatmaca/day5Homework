package day5Homework.core.abstracts;

import day5Homework.entities.concretes.User;

public interface LoggerService {
	void sendMail(User user);
}