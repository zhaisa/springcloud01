package com.service_b.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient("service-a")
public interface ServiceAFeignClient {
	@RequestMapping("testA")
	public String TestAController();
}
