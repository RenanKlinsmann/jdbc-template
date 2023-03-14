package com.example.djdbc.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class JdbcConfig {
	
	@Bean(name = "postgresSource")
	public DataSource dataSource() {
		DataSourceBuilder dataSource = DataSourceBuilder.create();
		dataSource.driverClassName("org.postgresql.Driver");
		dataSource.url("jdbc:postgresql://localhost:5432/delivery");
		dataSource.username("postgres");
		dataSource.password("RENAN123");
		return dataSource.build();
		
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
		
	}

}
