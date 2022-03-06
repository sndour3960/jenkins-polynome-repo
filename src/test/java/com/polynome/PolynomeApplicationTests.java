package com.polynome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PolynomeApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	public void calculTest() {
		int[] t = { 0, 2, 2, 2 };
		Polynome p = new Polynome(t);
		int r = p.calcul(2);
		assertEquals(28, r);
	}

}
