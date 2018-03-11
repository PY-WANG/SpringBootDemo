package com.smart.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class BbsDaemon {

	@RequestMapping("/1")
	public String index() {
		return "欢迎光临";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BbsDaemon.class, args);
	}
}
