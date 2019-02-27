package com.anlve.sun.dao;

import java.util.List;

import com.anlve.sun.entity.User;

public interface UserMapper {

	List<User> selectAllUser();

    int insertSelective(User record);
}