package com.wangchaoyue.service;

import java.util.List;

import com.wangchaoyue.entity.Category;

/**
 * @author 王超越
 *
 * 2019年11月15日
 */
public interface CategoryService {

	/**
	 * 获取分类
	 * @param chnId  频道id
	 * @return
	 */
	List<Category> listByChannelId(int chnId);
	
}
