package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import com.example.demo.controller.HomeController;

@SpringBootTest
class GsUnitTestingApplicationTests {

	@Autowired
	private HomeController controller;

	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
