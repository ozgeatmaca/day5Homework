package day5Homework.business.concretes;

import day5Homework.business.abstracts.UserService;
import day5Homework.core.abstracts.LoggerService;
import day5Homework.core.concretes.CheckRegister;
import day5Homework.core.concretes.Login;
import day5Homework.dataAccess.abstracts.LoginDao;
import day5Homework.dataAccess.abstracts.UserDao;
import day5Homework.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private LoggerService loggerService;
	private CheckRegister checkRegister;
	private LoginDao loginDao;
	

	public UserManager(UserDao userDao, LoggerService loggerService, CheckRegister checkRegister, LoginDao loginDao) {
		super();
		this.userDao = userDao;
		this.loggerService = loggerService;
		this.checkRegister = checkRegister;
		this.loginDao = loginDao;
	}

	@Override
	public void register(User user) {
		
		if(checkRegister.checkMail(user)) {
			userDao.add(user);
			loggerService.sendMail(user);
		}
		
	}

	@Override
	public void login(Login login) {
		
		
	}

	@Override
	public void login1(Login trueLogin) {
		
		
	}





}