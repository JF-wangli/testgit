package com.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.bean.TH_USER;

@Mapper
public interface UserMapper {
	
	public List<TH_USER> getAllUsers();
	
}
