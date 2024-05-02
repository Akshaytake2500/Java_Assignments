package com.app.Fruits;

public class Mango extends Fruit {
	public Mango(String name, String color, double weight, boolean fresh) {
		super(name, color, weight, fresh);
	}

	public void taste() {
		System.out.println("sweet");
	}

	public void jam() {
		System.out.println("Mango pulp");
	}

	public String toString() {
		return super.toString();
	}
}
