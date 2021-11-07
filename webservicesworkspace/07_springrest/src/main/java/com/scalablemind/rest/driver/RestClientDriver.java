package com.scalablemind.rest.driver;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClientDriver {
	
	
	  public static void main(String[] args) { 
		  
		  invokeUpdateOrder();
	  
	  }
	  
	  private static void invokeUpdateOrder() { 
		  
		  HttpHeaders headers = new HttpHeaders(); headers.setContentType(MediaType.APPLICATION_JSON);
		  HttpEntity<?> requestEntity = new HttpEntity<Object>("100001",headers);
	  
		  RestTemplate t = new RestTemplate();
		  
		  ResponseEntity<String> result =
				  t.postForEntity("http://localhost:8882/v1/services/Order", requestEntity,String.class); 
		  
		  
		  
		  System.out.print(result.getBody()); 
	  }
	 

}
