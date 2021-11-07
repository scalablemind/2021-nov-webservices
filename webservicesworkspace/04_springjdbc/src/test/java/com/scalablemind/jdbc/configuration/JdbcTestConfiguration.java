package com.scalablemind.jdbc.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.scalablemind.jdbc.repository")
@EnableAutoConfiguration
public class JdbcTestConfiguration {

}
