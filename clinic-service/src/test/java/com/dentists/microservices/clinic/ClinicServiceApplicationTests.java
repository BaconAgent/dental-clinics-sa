package com.dentists.microservices.clinic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ClinicServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}