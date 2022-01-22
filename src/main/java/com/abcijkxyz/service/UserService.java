package com.abcijkxyz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.abcijkxyz.event.UserRegisterEvent;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private ApplicationContext applicationContext;

	public void register(String username) {
		// 执行注册逻辑
		log.info("[register][执行用户({}) 的注册逻辑]", username);

		// 发布
		applicationContext.publishEvent(new UserRegisterEvent(this, username));
	}

}
