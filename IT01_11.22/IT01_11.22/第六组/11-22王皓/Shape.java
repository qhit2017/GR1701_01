package com.WH;
//¸¸Àà
public abstract class Shape {
	
	int side;
	double anyle;
	double area;
	
	
	
	abstract public double getArea();



	@Override
	public String toString() {
		return "Shape [side=" + side + ", anyle=" + anyle + ", area=" + area
				+ "]";
	}
	
	
	
	

}
