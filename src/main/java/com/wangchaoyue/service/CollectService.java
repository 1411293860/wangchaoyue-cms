package com.wangchaoyue.service;

import javax.validation.Valid;

import com.github.pagehelper.PageInfo;
import com.wangchaoyue.entity.Collect;

/**
 *  收藏
 * @author 王超越
 *
 */
public interface CollectService {

	/**
	 * 
	 * @param collect
	 * @return
	 */
	int add(Collect collect);
	/**
	 * 
	 * @param page
	 * @return
	 */
	PageInfo list(int userId,int page);
	/**
	 * 
	 * @param id
	 * @return
	 */
	int delete(int id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Collect get(int id);
	
	/**
	 * 
	 * @param collect
	 * @return
	 */
	int update( Collect collect);

}
