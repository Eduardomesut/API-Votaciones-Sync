package com.example.api_votaciones_sync;

import com.example.api_votaciones_sync.controller.VotacionesController;
import com.example.api_votaciones_sync.service.VotacionesData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApiVotacionesSyncApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApiVotacionesSyncApplication.class, args);
		VotacionesData data = context.getBean(VotacionesData.class);
	}

}
