package com.wangchaoyue.entity;

import java.io.Serializable;

/**
 * @author 王超越
 *
 * 2019年11月14日
 */
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8584634421733426939L;

	private Integer id;

	private String name;

	/**
	 * 频道id
	 */
	private int channelId;

	/**
	 * 频道
	 */
	private Channel channel;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
}
