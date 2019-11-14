package com.wangchaoyue.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangchaoyue.common.ConstantClass;
import com.wangchaoyue.dao.UserMapper;
import com.wangchaoyue.entity.User;
import com.wangchaoyue.service.UserService;

/**
 * @author 王超越
 *
 * 2019年11月13日
 */
@Service
@Component
public class UserServiceImpl implements UserService{

	
	@Autowired
	UserMapper userMapper;
	
	/* 
	 * 
	 */
	@Override
	public PageInfo<User> getPageList(String name, Integer page) {
		PageHelper.startPage(page, ConstantClass.PAGE_SIZE);
		return new PageInfo<User>(userMapper.list(name));
	}

	/* 
	 * 
	 */
	@Override
	public User getUserById(Integer userId) {
		return userMapper.getById(userId);
	}

	/* (non-Javadoc)
	 * @see com.wangchaoyue.service.UserService#updateStatus(java.lang.Integer, int)
	 */
	@Override
	public int updateStatus(Integer userId, int status) {
		return userMapper.updateStatus(userId,status);
	}

}
