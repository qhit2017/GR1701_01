package com.Commodity;

public class Commodity {

	
	private String id;
	private String name;
	private double price  ;
	private String number;
	
	public Commodity  () {
		
	}

	/**
	 * @param id
	 * @param name
	 * @param a
	 * @param number
	 */
	public Commodity(String id, String name, String a, String number) {
		this.id = id;
		this.name = name;
		this.price=price ;
		this.number = number;
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
		this.price = (int) price;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", price=" + price
				+ ", number=" + number + "]";
	}
	
	
	
	
}
