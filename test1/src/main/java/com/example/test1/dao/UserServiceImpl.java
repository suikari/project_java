package com.example.test1.dao;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test1.mapper.UserMapper;
import com.example.test1.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public HashMap<String, Object> userLogin(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		User user = userMapper.userLogin(map);
		
		resultMap.put("user", user);

		if (user != null) {
			resultMap.put("result", "success");
			resultMap.put("uid", user.getUid());
			resultMap.put("uname", user.getName());
		} else {
			resultMap.put("result", "fail");			
		}
		
		return resultMap;
	}
}
