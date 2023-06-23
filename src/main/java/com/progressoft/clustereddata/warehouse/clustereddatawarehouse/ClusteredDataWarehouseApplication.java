package com.progressoft.clustereddata.warehouse.clustereddatawarehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.progressoft.clustereddata.warehouse.clustereddatawarehouse.repository")
@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan(value = "com.progressoft.clustereddata.warehouse.clustereddatawarehouse")
public class ClusteredDataWarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClusteredDataWarehouseApplication.class, args);
	}

}
