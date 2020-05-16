package com.akshay.managers;

import com.akshay.entities.User;

public class UserManager {
	private static UserManager instance=new UserManager();
	private UserManager() {}
	public static UserManager getInstance() {
		return instance;
	}
	public User createUser(long id,String email,String password,String firstName,String lastName,int gender,String userType) {
		User user =new User();
		user.setId(id);
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setGender(gender);
		user.setLastName(lastName);
		user.setPassword(password);
		user.setUserType(userType);
		return user;
	}
}
