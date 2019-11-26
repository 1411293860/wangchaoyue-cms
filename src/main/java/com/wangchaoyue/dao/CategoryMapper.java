package com.wangchaoyue.dao;

import java.util.List;

import com.wangchaoyue.entity.Category;

/**
 * @author 王超越
 *
 * 2019年11月15日
 */
public interface CategoryMapper {

	/**
	 * 获取分类
	 * @param chnId
	 * @return
	 */
	List<Category> listByChannelId(int chnId);

}
