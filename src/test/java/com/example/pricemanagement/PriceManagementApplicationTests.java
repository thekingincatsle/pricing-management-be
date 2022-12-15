package com.example.pricemanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EntityScan("com.example.pricemanagement.repository.model")
class PriceManagementApplicationTests {

	@Test
	void contextLoads() {
	}

}
