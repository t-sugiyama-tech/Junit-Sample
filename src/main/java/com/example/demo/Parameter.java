package com.example.demo;

public class Parameter {

	private final int tax;
	int price;

	public Parameter(int tax) {
		this.tax = tax;
	}

	public int sumTotalCost(int price) {
		int totalCost = price + (price  * tax / 100);
		return totalCost;
	}
}
