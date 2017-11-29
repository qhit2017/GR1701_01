package com.jkl;

public class Mouse implements Zoology{

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shout() {
		// TODO Auto-generated method stub
		return null;
	}

	private String name;
	private String breed;
	private int legs;
	private double weight;
	
	public Mouse(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public Mouse() {
		// TODO Auto-generated constructor stub
	}
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
	
}
