package com.anlve.sun.service;

import java.util.List;

import com.anlve.sun.entity.User;

public interface UserService {

	int addUser(User user);

	List<User> findAllUser(int pageNum, int pageSize);
}
