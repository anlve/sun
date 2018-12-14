package com.anlve.sun.dao;

import java.util.List;

import com.anlve.sun.model.User;

public interface UserMapper {

	int insertSelective(User record);

    List<User> selectAllUser();
}