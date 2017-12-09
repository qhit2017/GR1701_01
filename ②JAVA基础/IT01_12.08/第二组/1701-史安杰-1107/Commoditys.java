package com.saj;

public class Commoditys {

	private String id;
	private String name;
	private double price;
	private long number;

	public Commoditys() {
		super();
	}

	public Commoditys(String id, String name, double price, long number) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
		this.price = price;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long newcommoditys) {
		this.number = newcommoditys;
	}

	@Override
	public String toString() {
		return "商品 [编号=" + id + ", 商品名称=" + name + ", 价格=" + price
				+ ", 库存=" + number + "]";
	}

}
