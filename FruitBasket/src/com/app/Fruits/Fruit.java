package com.app.Fruits;

public abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;

	public Fruit(String name, String color, double weight, boolean fresh) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.fresh = fresh;
	}

	public abstract void taste();
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public String toString() {
		return "Name: " + name + " Color: " + color + " Weight: " + weight;
	}
}
