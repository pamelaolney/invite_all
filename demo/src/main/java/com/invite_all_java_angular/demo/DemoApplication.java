package com.invite_all_java_angular.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner init(InviteRepository repository) {
		return args -> {
			Stream.of("Lunch Room", "Cava", "Pins Arcade").forEach(name -> 
				{
					Invite invite = new Invite();					
					invite.setName(name);
					repository.save(invite);
				});
			repository.findAll().forEach(System.out::println);
		};
	}
}
