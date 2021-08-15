package com.example.demo;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class SampleTest {

	@Test
	public void add() throws Exception {
		Sample add = new Sample();
		int expected = 7;
		int actual = add.add(5, 2);
		assertEquals(actual, expected);
	}

	@Test
	public void sub() throws Exception {
		Sample sub = new Sample();
		int expected = 3;
		int actual = sub.sub(5, 2);
		assertEquals(actual, expected);
	}

	@Test
	public void mul() throws Exception {
		Sample mul = new Sample();
		int expected = 10;
		int actual = mul.mul(5, 2);
		assertEquals(actual, expected);
	}

	@Test
	public void div() throws Exception {
		Sample div = new Sample();
		float expected = 2.5f;
		float actual = div.div(5, 2);
		float delta = 0.0f;
		assertEquals(expected, actual, delta);
	}

	// 0除算対策
	@Test
	public void DivException() throws Exception {
		Sample div = new Sample();
		try {
			div.div(3, 0);
			fail();
		} catch (IllegalArgumentException e) {
			// 成功
		}
	}

	// ラムダ式による0除算対策
	public void DivlamdbaException() throws Exception {
		Sample div = new Sample();
        assertThrows(IllegalArgumentException.class, () -> div.div(3, 0));
	}

}
