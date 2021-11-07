package com.scalablemind.jaxws.impl;

import javax.jws.WebService;

import com.scalablemind.jaxws.OrderService;

@WebService(endpointInterface = "com.scalablemind.jaxws.impl.OrderServiceImpl")
public class OrderServiceImpl implements OrderService{
	
	@Override
	public String updateOrder(String orderId) {
		return String.format("order# %s updated from jaxws web service",orderId);
	}

}
