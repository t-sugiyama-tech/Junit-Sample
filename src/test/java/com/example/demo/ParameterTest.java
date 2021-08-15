package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterTest {

	@ParameterizedTest
	@CsvSource({"100,8,108",
		        "1000,10,1100",
		        "3000,5,3150"})

	void testsumTotalCost(int price, int tax, int expected) {
		Parameter p = new Parameter(tax);
		assertEquals(expected, p.sumTotalCost(price));
	}
}
