package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void add() throws Exception {
		Calculator add = new Calculator();
		int expected = 7;
		int actual = add.add(5, 2);
		assertEquals(actual, expected);
	}

	@Test
	public void sub() throws Exception {
		Calculator sub = new Calculator();
		int expected = 3;
		int actual = sub.sub(5, 2);
		assertEquals(actual, expected);
	}

	@Test
	public void mul() throws Exception {
		Calculator mul = new Calculator();
		int expected = 10;
		int actual = mul.mul(5, 2);
		assertEquals(actual, expected);
	}

	@Test
	public void div() throws Exception {
		Calculator div = new Calculator();
		float expected = 2.5f;
		float actual = div.div(5, 2);
		float delta = 0.0f;
		assertEquals(expected, actual, delta);
	}


}
