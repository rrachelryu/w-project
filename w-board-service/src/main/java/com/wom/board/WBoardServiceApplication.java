package com.wom.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@RefreshScope
public class WBoardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WBoardServiceApplication.class, args);
	}

}
