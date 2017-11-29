package com;

public class Mouse implements Animal {

	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getShout() {
		// TODO Auto-generated method stub
		return null;
	}
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	private String  breed;
	private int legs;
	private double weight;
	

}
