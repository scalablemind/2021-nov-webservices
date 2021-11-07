package com.scalablemind.jaxws.client.driver;

import com.scalablemind.jaxws.impl.OrderServiceImplService;

public class OrderServiceClientDriver {
	
	public static void main(String[] args) {
		OrderServiceImplService orderService = new OrderServiceImplService();
		String outputResult = orderService.getOrderServiceImplPort().updateOrder("Test00008");
		
		System.out.println(outputResult);
		
	}

}
