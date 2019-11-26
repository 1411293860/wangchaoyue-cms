package com.wangchaoyue.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangchaoyue.dao.ChannelMapper;
import com.wangchaoyue.entity.Channel;
import com.wangchaoyue.service.ChannelService;

/**
 * @author 王超越
 *
 * 2019年11月14日
 */
@Service
public class ChannelServiceImpl  implements ChannelService{
	
	@Autowired
	ChannelMapper channelMapper;

	@Override
	public List<Channel> list() {
		// TODO Auto-generated method stub
		return channelMapper.list();
	}

}