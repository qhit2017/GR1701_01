package com;

public class Student {
	private     String name;
	public Student(String name, String id, double chinase, double math,
			double english, double total) {
		super();
		this.name = name;
		this.id = id;
		this.chinase = chinase;
		this.math = math;
		this.english = english;
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getChinase() {
		return chinase;
	}
	public void setChinase(double chinase) {
		this.chinase = chinase;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public double getTotal() {
		total=chinase+math+english;
		return total;
	}
	private  	String id;
	private 	double chinase;
	private 	double math;
	private     double english;
	private     double total;
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", chinase=" + chinase
				+ ", math=" + math + ", english=" + english + ", total="
				+ total + "]";
	}
	
	
	
	
	
	

}
