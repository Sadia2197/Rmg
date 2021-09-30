package com.tataelxsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
@CrossOrigin("http://localhost:4200/")
public class RmgReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmgReportApplication.class, args);
	}

}
