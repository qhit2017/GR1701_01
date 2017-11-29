package com.duhuiyou;

//要求正方形具有的属性包括：边长、周长、面积（属性私有） 
//并创建两种构造方法（1 无参构造方法 2 参数为边长的构造方法）
public class Square implements Form {

	@Override
	public Form perimeter() {
		System.out.println(bianchang*4);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Form area() {
		System.out.println(bianchang*bianchang);
		// TODO Auto-generated method stub
		return null;
	}
	
	int bianchang;

	
	public int getBianchang() {
		return bianchang;
	}

	public void setBianchang(int bianchang) {
		this.bianchang = 1;
	}

	/**
	 * @param bianchang
	 */
	public Square(int bianchang) {
		this.bianchang = bianchang;
	}

	@Override
	public String toString() {
		return "Square [bianchang=" + bianchang + "]";
	}
	
}
