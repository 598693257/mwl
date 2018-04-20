package com.huaxin.mwl;

import com.huaxin.mwl.service.User1MapperManage;

public class FirstAction {
	private User1MapperManage user1MapperManage;
	public String method(){
		System.out.println("123456");
		String name =user1MapperManage.selectUser(1).getName();
		System.out.println(name);
		return "abc";
	}
	public User1MapperManage getUser1MapperManage() {
		return user1MapperManage;
	}
	public void setUser1MapperManage(User1MapperManage user1MapperManage) {
		this.user1MapperManage = user1MapperManage;
	}

}
