package com.commodity;

public class Commodity {
	private String id;
	private String name;
	private double price;
	private long namde;
	public Commodity(){
		
	}
	public Commodity(String id, String name, double price, long namde) {
		//super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.namde = namde;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", price=" + price
				+ ", namde=" + namde + "]";
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
	public long getNamde() {
		return namde;
	}
	public void setNamde(long namde) {
		this.namde = namde;
	}
	
}
