package com.scalablemind.rest.controller;

public class OrderExceptionInfo {
	
	private String errorCode;
	
	public OrderExceptionInfo(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	

}
