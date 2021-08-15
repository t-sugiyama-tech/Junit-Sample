package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SampleTest {

	@Test
	void add() throws Exception {
		Sample add = new Sample();
		int expected = 7;
		int actual = add.add(5, 2);
		assertEquals(actual, expected);
	}

	@Test
	void sub() throws Exception {
		Sample sub = new Sample();
		int expected = 3;
		int actual = sub.sub(5, 2);
		assertEquals(actual, expected);
	}

	@Test
	void mul() throws Exception {
		Sample mul = new Sample();
		int expected = 10;
		int actual = mul.mul(5, 2);
		assertEquals(actual, expected);
	}

	@Test
	void div() throws Exception {
		Sample div = new Sample();
		float expected = 2.5f;
		float actual = div.div(5, 2);
		assertEquals(expected, actual);
	}

	// 0除算対策
	@Test
	void DivException() throws Exception {
		Sample div = new Sample();
		try {
			div.div(3, 0);
			fail();
		} catch (IllegalArgumentException e) {
			// 成功
		}
	}

	// ラムダ式による0除算対策
	void DivlambdaException() throws Exception {
		Sample div = new Sample();
        assertThrows(IllegalArgumentException.class, () -> div.div(3, 0));
	}

}
