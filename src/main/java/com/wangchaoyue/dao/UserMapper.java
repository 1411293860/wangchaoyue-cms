package com.wangchaoyue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.wangchaoyue.entity.User;

/**
 * @author 王超越
 *
 * 2019年11月13日
 */
public interface UserMapper {

	/**
	 * @param name
	 * @return
	 */
	List<User> list(String name);

	/**
	 * @param userId
	 * @return
	 */
	User getById(Integer userId);

	/**
	 * @param userId
	 * @param status
	 * @return
	 */
	@Update("UPDATE cms_user SET locked=${status} WHERE id=${userId}")
	int updateStatus(@Param("userId")Integer userId,@Param("status") int status);

}
