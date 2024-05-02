package com.app.Fruits;

public class Orange extends Fruit {
	public Orange(String name, String color, double weight, boolean fresh) {
		super(name, color, weight, fresh);
	}

	public void taste() {
		System.out.println("sour");
	}

	public void juice() {
		System.out.println("Orange juice");
	}

	public String toString() {
		return super.toString();
	}
}
