	package com.wangchaoyue.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangchaoyue.dao.CategoryMapper;
import com.wangchaoyue.entity.Category;
import com.wangchaoyue.service.CategoryService;

/**
 * @author 王超越
 *
 * 2019年11月15日
 */
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryMapper categoryMapper;

	@Override
	public List<Category> listByChannelId(int chnId) {
		// TODO Auto-generated method stub
		return categoryMapper.listByChannelId(chnId);
	}
}