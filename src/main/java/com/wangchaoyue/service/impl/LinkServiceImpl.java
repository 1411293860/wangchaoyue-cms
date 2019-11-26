package com.wangchaoyue.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangchaoyue.dao.LinkMapper;
import com.wangchaoyue.entity.Link;
import com.wangchaoyue.service.LinkService;

/**
 * 
 * @author 王超越
 *
 */
@Service
public class LinkServiceImpl  implements LinkService{
	
	@Autowired
	LinkMapper linkMapper;

	@Override
	public int add(Link link) {
		// TODO Auto-generated method stub
		return linkMapper.add(link);
		
	}

	@Override
	public PageInfo list(int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,10);
		
		return new PageInfo<Link>(linkMapper.list());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return linkMapper.delete(id);
	}

	@Override
	public Link get(int id) {
		// TODO Auto-generated method stub
		return linkMapper.get(id);
	}

	@Override
	public int update(Link link) {
		// TODO Auto-generated method stub
		return linkMapper.update(link);
		
	}

}
