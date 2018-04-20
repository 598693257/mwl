package com.huaxin.mwl.service.impl;

import com.huaxin.mwl.dao.User1Mapper;
import com.huaxin.mwl.model.User1;
import com.huaxin.mwl.service.User1MapperManage;

public class User1MapperManageImpl implements User1MapperManage{
	
	private User1Mapper user1Mapper;

	public User1Mapper getUser1Mapper() {
		return user1Mapper;
	}

	public void setUser1Mapper(User1Mapper user1Mapper) {
		this.user1Mapper = user1Mapper;
	}

	@Override
	public User1 selectUser(Integer id) {
		
		return user1Mapper.selectByPrimaryKey(id);
	}
	

}
