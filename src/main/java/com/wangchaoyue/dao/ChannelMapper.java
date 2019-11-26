package com.wangchaoyue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.wangchaoyue.entity.Channel;

/**
 * @author 王超越
 *
 * 2019年11月14日
 */
public interface ChannelMapper {

	@Select("SELECT * FROM cms_channel ORDER BY id")
	public List<Channel> list();

}
