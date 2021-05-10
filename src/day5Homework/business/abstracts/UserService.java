package day5Homework.business.abstracts;

import day5Homework.core.concretes.Login;
import day5Homework.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(Login login);
	void login1(Login trueLogin);
}
