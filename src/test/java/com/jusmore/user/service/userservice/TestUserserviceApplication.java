package com.jusmore.user.service.userservice;

import org.springframework.boot.SpringApplication;

public class TestUserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.from(UserserviceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
