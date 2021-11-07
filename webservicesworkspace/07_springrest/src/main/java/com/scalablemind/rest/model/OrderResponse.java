package com.scalablemind.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrderResponse {
	
	private String message;
	
	public OrderResponse() {
	}
	
	public OrderResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
