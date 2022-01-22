package com.abcijkxyz.event;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;

/**
 * 用户注册事件
 */
public class UserRegisterEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	@Getter
	private String username;

	public UserRegisterEvent(Object source, String username) {
		super(source);
		this.username = username;
	}

}
