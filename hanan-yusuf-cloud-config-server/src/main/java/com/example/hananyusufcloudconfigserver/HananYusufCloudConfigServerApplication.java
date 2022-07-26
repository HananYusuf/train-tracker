package com.example.hananyusufcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HananYusufCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HananYusufCloudConfigServerApplication.class, args);
	}

}
