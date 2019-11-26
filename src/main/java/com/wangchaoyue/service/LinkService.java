package com.wangchaoyue.service;

import javax.validation.Valid;

import com.github.pagehelper.PageInfo;
import com.wangchaoyue.entity.Link;

/**
 * 
 * @author 王超越
 *
 */
public interface LinkService {

	int add(Link link);
	PageInfo list(int page);
	int delete(int id);
	Link get(int id);
	int update( Link link);

}
