package com.abcijkxyz.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.abcijkxyz.event.UserRegisterEvent;
import lombok.extern.slf4j.Slf4j;

// 优惠券
@Component
@Slf4j
public class CouponListener {

	@EventListener
	public void addCoupon(UserRegisterEvent event) {
		log.info("[addCoupon][给用户({}) 发放优惠劵]", event.getUsername());
	}

}
