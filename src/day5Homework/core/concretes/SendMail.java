package day5Homework.core.concretes;

import day5Homework.core.abstracts.LoggerService;
import day5Homework.entities.concretes.User;

public class SendMail implements LoggerService {

	@Override
	public void sendMail(User user) {
		System.out.println("" +user.getMail()+ " mailine doðrulama linki gönderildi.");
		
	}

}
