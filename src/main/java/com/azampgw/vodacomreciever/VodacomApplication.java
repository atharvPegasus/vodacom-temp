package com.azampgw.vodacomreciever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.azampgw.controller.VodacomController;

@SpringBootApplication
@ComponentScan(basePackageClasses = VodacomController.class)
public class VodacomApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(VodacomApplication.class, args);
	}

}
