package com.anlve.sun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anlve.sun.dao.UserMapper;
import com.anlve.sun.model.User;
import com.anlve.sun.service.UserService;
import com.github.pagehelper.PageHelper;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public int addUser(User user) {
		return userMapper.insertSelective(user);
	}

	/**
	 * pageNum	开始页数
	 * pageSize	每页显示的数据条数
	 */
	public List<User> findAllUser(int pageNum, int pageSize) {
		//将参数传给这个方法就可以实现物理分页了，非常简单。
		PageHelper.startPage(pageNum, pageSize);
		return userMapper.selectAllUser();
	}

}
