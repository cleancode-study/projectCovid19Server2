package com.example.project_server110_springboot;

import com.example.project_server110_springboot.entity.openapi.Covid19noti;
import com.example.project_server110_springboot.repository.openapi.Covid19notiRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class projectserver110springbootApplicationTests {

	private Covid19notiRepository covid19notiRepository;

	@Autowired
	projectserver110springbootApplicationTests(Covid19notiRepository covid19notiRepository) {
		this.covid19notiRepository = covid19notiRepository;

	}
	@Test
	void contextLoads() {
		covid19notiRepository.save(new Covid19noti());
	}

}
