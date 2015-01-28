package com.bloc.securitypackages; 

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

public abstract class Fruit extends Object {
	// The name of the fruit
	private String mName;
	// Number of calories
	private int mCalories;
	// Color of the fruit
	private Color mColor;
	// Weight of the fruit, in pounds
	private double mWeight;

	Fruit() {
		this("Apple");
		// Default fruit
	}

	Fruit(String name) {
		this(name, 0);
	}

	Fruit(String name, int calories) {
		this(name, calories, null);
	}

	Fruit(String name, int calories, Color color) {
		this(name, calories, color, 0d);
	}

	protected Fruit(String name, int calories, Color color, double weight) {
		this.mName = name;
		this.mCalories = calories;
		this.mColor = color;
		this.mWeight = weight;
	}

	public String getName() {
		return mName;
	}

	protected void setName(String name) {
		mName = name;
	}

	public int getCalories() {
		return mCalories;
	}

	protected void setCalories(int calories) {
		mCalories = calories;
	}

	public Color getColor() {
		return mColor;
	}

	protected void setColor(Color color) {
		mColor = color;
	}

	protected double getWeight() {
		return mWeight;
	}

	protected void setWeight(double weight) {
		mWeight = weight;
	}
}