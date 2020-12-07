package com.schoolofnet.QueryDTO;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class QueryDtoApplication implements ApplicationRunner {

	@Autowired
	private UserRepository repository;

	public QueryDtoApplication(UserRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(QueryDtoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		repository.save(new User("Wesley", 36));
		List<UserDTO> result = repository.findByNameDTO("Leonan");
		ObjectMapper mapper = new ObjectMapper();
		String jsonResult = mapper.writeValueAsString(result);
		System.out.println(jsonResult);
	}
}
