package com.scalablemind.rest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scalablemind.rest.jpa.entity.TestJpaData;
import com.scalablemind.rest.springdata.repository.TestDataJpaRepository;

@RestController
@RequestMapping("/v1")
public class OrderController {	
	
	  private ObjectMapper mapper = new ObjectMapper();
	  
	  
	  @Autowired
	  private TestDataJpaRepository repository;
	  
	  //Accept
	  //Content-Type
	  
	  @GetMapping(value="/services/Order/{testId}",produces= {"application/json","application/xml"}) 
	  public String getOrderStatus(@PathVariable("testId") Integer testId) { 
		  try { 
			  Optional<TestJpaData> testDataOptional = repository.findById(testId);
			  
			  if(testDataOptional==null || testDataOptional.get()==null) {
				  return mapper.writeValueAsString(String.format("no records found"));
			  }
			  
			  TestJpaData testData = testDataOptional.get();
			  return mapper.writeValueAsString(String.format("test id:[%s], remarks:[%s]",testData.getTestId(),testData.getRemarks()));
		  } catch(JsonProcessingException ex) { 
			  return "system error while processing";
		  } 
	  }
	  
	  @PostMapping(value="/services/Order",produces="application/json",consumes="application/json") 
	  public String updateRemarks(@RequestBody String remarks) {
		  try { 
			  TestJpaData data = new TestJpaData();
			  data.setRemarks(remarks);
			  repository.save(data);
			  return mapper.writeValueAsString(String.format("remarks:%s inserted with testid:%s",remarks,data.getTestId())); 
		  }catch(JsonProcessingException ex) { 
			  return "system error while processing"; 
		  }
	  }
	 

}
