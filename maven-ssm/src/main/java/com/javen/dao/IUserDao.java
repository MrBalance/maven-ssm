package com.javen.dao;


import org.springframework.stereotype.Service;

import com.javen.model.User;
@Service
public interface IUserDao {
	User selectByPrimaryKey(int userId);
}
