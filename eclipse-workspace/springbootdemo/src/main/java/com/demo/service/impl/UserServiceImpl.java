package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.TH_USER;
import com.demo.mapper.UserMapper;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	public List<TH_USER> getAllUsers(){
		
		return userMapper.getAllUsers();
	}
}
