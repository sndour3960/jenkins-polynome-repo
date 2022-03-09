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
		assertEquals(29, r);
	}

	@Test
	public void additionTest() {
		int[] t2 = {0,2,1,4};
		int[] t1 = {1,2,3};
		Polynome pl = new Polynome(t1);
		Polynome pl1 = new Polynome(t2);
		Polynome pl2 = pl.addition(pl1);
		String res = pl2.toString();
		assertEquals("1+4X^1+4X^2+4X^3", res);//3
	}
}
