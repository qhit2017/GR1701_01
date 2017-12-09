package com.qhit.yc;

public class Commodity {
	
	private String id;
	private String name;
	private double prive;
	private long number;
	
	public Commodity() {
	}
	public Commodity(String id, String name, double prive, long number) {
		this.id = id;
		this.name = name;
		this.prive = prive;
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
	public double getPrive() {
		return prive;
	}
	public void setPrive(double prive) {
		this.prive = prive;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", prive=" + prive
				+ ", number=" + number + "]";
	}

}
