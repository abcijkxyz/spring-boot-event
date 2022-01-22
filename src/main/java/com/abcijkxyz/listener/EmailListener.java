package com.abcijkxyz.listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.abcijkxyz.event.UserRegisterEvent;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class EmailListener {

	@EventListener
	@Async
	public void sendEmail(UserRegisterEvent event) {
		log.info("[sendEmail][给用户({}) 发送邮件]", event.getUsername());
	}

}
