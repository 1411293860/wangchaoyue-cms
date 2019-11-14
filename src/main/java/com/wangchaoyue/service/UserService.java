package com.wangchaoyue.service;

import com.github.pagehelper.PageInfo;
import com.wangchaoyue.entity.User;

/**
 * @author 王超越
 *
 * 2019年11月13日
 */
public interface UserService {

	/**
	 * @param name
	 * @param page
	 * @return
	 */
	PageInfo<User> getPageList(String name, Integer page);

	/**
	 * @param userId
	 * @return
	 */
	User getUserById(Integer userId);

	/**
	 * @param userId
	 * @param status
	 * @return
	 */
	int updateStatus(Integer userId, int status);

}
