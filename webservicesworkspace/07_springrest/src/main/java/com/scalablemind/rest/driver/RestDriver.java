package com.scalablemind.rest.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.scalablemind.rest.configuration.RestConfiguration;

@SpringBootApplication(scanBasePackageClasses = RestConfiguration.class)
@EntityScan("com.scalablemind.rest.jpa.entity")
@EnableJpaRepositories(basePackages = "com.scalablemind.rest.springdata.repository")
public class RestDriver extends SpringBootServletInitializer {
	
	  public static void main(String[] args) { 
		  ConfigurableApplicationContext ctx = SpringApplication.run(RestDriver.class,args); 
	  }
	  
	  @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {  
		  return builder.sources(RestDriver.class); 
	  }
	 

}
