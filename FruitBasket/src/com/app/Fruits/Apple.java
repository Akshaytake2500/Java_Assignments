package com.app.Fruits;

public class Apple extends Fruit {

	public Apple(String name, String color, double weight, boolean fresh) {
		super(name, color, weight, fresh);
	}

	public void taste() {
		System.out.println("sweet n sour");
	}

	public void jam() {
		System.out.println("Apple jam");
	}

	public String toString() {
		return super.toString();
	}
}
