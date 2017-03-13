package com.leo.service;

import org.springframework.transaction.annotation.Transactional;

import com.leo.dao.UserDao;

@Transactional
public class UserService {
	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void add(){
		System.out.println("userService.....");
		userDao.add();
	}

}
