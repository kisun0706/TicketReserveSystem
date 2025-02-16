package com.ticket_reserve_system.java.study;

import org.springframework.boot.SpringApplication;

public class TestJavaStudyApplication {

	public static void main(String[] args) {
		SpringApplication.from(JavaStudyApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
