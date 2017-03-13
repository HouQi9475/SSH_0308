package com.leo.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.leo.dao.UserDao;
import com.leo.domain.Users;

public class UserDaoImpl implements UserDao {

	//创建hibernatetemplate对象
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		Users user=new Users();
		user.setUid(5);
		user.setUname("xiaoze");
		user.setUpwd("x111");
		hibernateTemplate.save(user);
	}

}
