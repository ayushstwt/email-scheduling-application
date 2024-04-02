package com.narainox.mailSchedulerApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MailSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailSchedulerApplication.class, args);
	}

}
