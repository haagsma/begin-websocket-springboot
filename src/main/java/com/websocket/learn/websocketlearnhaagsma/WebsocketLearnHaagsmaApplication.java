package com.websocket.learn.websocketlearnhaagsma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScan(value = "com.websocket.learn")
@SpringBootApplication
public class WebsocketLearnHaagsmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketLearnHaagsmaApplication.class, args);
	}

}
