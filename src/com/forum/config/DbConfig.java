package com.forum.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.forum")
@PropertySource("classpath:application.properties")
public class DbConfig {

	
	@Value("${database.url}")
	private String databaseURL;
	
	@Value("${database.user}")
	private String databaseUSERS;
	
	@Value("${database.password}")
	private String databasePASS;
	
	@Value("${database.driver}")
	private String databaseDriver;
	
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
	
	private DataSource dataSource() {
		DriverManagerDataSource manager =  new DriverManagerDataSource();
		
		System.out.println("DB:" +databaseURL);
		System.out.println("User:" +databaseUSERS);
		System.out.println("Pass:" +databasePASS);
		
		manager.setDriverClassName(databaseDriver);
		manager.setUrl(databaseURL);
		manager.setUsername(databaseUSERS);
		manager.setPassword(databasePASS);
		
		return manager;
	}
	
	
}
