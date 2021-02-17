package com.cors.CORS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CorsApplication {
						//스키마  호스트이름  포트번호   ==> 이 3개가 origin내용
//	@CrossOrigin(origins="http://localhost:8070")
	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}
	public static void main(String[] args) {

		SpringApplication.run(CorsApplication.class, args);
	}

}
