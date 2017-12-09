package com.commodity;
/*Author：刘龑聪
  E-mail：15539919713@163.com
 */
public class Commodity {

	private String id;
	private String name;
	private double price;
	private long num;
	
	public Commodity(String id, String name, double price, long num) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.num = num;
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

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "编号:" + id + ",名称:" + name + ",价格:" + price
				+ ",数量:" + num + ".";
	}
	
	
}
