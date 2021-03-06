package com.zhuoyue.configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.zhuoyue.interceptor.AdminInterceptor;
import com.zhuoyue.interceptor.LoginInterceptor;
import com.zhuoyue.interceptor.PassportInterceptor;
/*
 * @author 兰心序
 * */
@Component
public class WebConfiguration extends WebMvcConfigurerAdapter{
@Autowired
PassportInterceptor passportInterceptor;
@Autowired
LoginInterceptor loginInterceptor;
@Autowired
AdminInterceptor adminInterceptor;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(passportInterceptor);
		registry.addInterceptor(loginInterceptor).addPathPatterns("/admin/*")
		.addPathPatterns("/customer/host/*");
		registry.addInterceptor(adminInterceptor).addPathPatterns("/admin/*");
		super.addInterceptors(registry);
	}

}
