package com.bway.springproject.dao;

import com.bway.springproject.model.User;

public interface UserDao {
	
	void userSignup(User u);
	boolean userLogin(String un, String psw);

}
