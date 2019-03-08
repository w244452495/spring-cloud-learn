package com.lx.eureka.zuul.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component
@RefreshScope
public class TestZuulFilter0 extends ZuulFilter {
	
	private Logger logger = LoggerFactory.getLogger(TestZuulFilter0.class);
	
	@Value("${token}")
	private String token;

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		logger.info("===========================" + token + "===========================");
		logger.info("pre 1");
		logger.info("pre 1");
		logger.info("pre 1");
		return null;
	}

	@Override
	public String filterType() {
		return FilterConstants.PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
