package com.banesco;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoWebApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testGeneratorInstanceId() {
		String s = RandomStringUtils.randomAlphanumeric(25);
		System.out.println("INSTANCEID-"+s);
	}

	@Test
	void testGeneratorInstanceIdMultiple() {

		for (int i=0; i < 100; i++) {
			String s = RandomStringUtils.randomAlphanumeric(25);
			System.out.println("INSTANCEID-"+s);
		}

	}

	@Test
	void testGeneratorRequestId() {
		String s = RandomStringUtils.randomAlphanumeric(35);
		System.out.println("REQUESTID-"+s);
	}



	@Test
	void testGeneratorRequestIdMultiple() {
		for (int i=0; i < 100; i++) {
			String s = RandomStringUtils.randomAlphanumeric(35);
			System.out.println("REQUESTID-"+s);
		}
	}

}
