package com.it01;

public class Commodity {
	private String id;
	private String name;
	private double price;
	private long number;
	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param number
	 */
	public Commodity(String id, String name, double price, long number) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
	}
	/**
	 * 
	 */
	public Commodity() {
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", price=" + price
				+ ", number=" + number + "]";
	}
	
	
	
}
