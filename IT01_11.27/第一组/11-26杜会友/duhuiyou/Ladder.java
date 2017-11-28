package com.duhuiyou;

//c.创建梯形，实现形状这个接口。
//要求梯形具有的属性包括：上边上、下边长、高、周长、面积（属性私有） 
//并创建两种构造方法（1 无参构造方法 2 参数为上边长、下边长的构造方法）
public class Ladder implements Form {

	@Override
	public Form perimeter() {
		// TODO Auto-generated method stub
		System.out.println();
		return null;
	}

	@Override
	public Form area() {
		// TODO Auto-generated method stub
		System.out.println(((belowbottom+upbottom)*tall)%2);
		return null;
	}
	int upbottom,belowbottom, tall,perimeter,area;
	public int getUpbottom() {
		return upbottom;
	}

	public void setUpbottom(int upbottom) {
		this.upbottom = 1;
	}

	public int getBelowbottom() {
		return belowbottom;
	}

	public void setBelowbottom(int belowbottom) {
		this.belowbottom = 2;
	}

	public int getTall() {
		return tall;
	}

	public void setTall(int tall) {
		this.tall = 3;
	}

	public int getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = 4;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = 5;
	}

	/**
	 * @param upbottom
	 * @param belowbottom
	 * @param tall
	 * @param perimeter
	 * @param area
	 */
	public Ladder(int upbottom, int belowbottom, int tall, int perimeter,
			int area) {
		this.upbottom = upbottom;
		this.belowbottom = belowbottom;
		this.tall = tall;
		this.perimeter = perimeter;
		this.area = area;
	}

	@Override
	public String toString() {
		return "Ladder [upbottom=" + upbottom + ", belowbottom=" + belowbottom
				+ ", tall=" + tall + ", perimeter=" + perimeter + ", area="
				+ area + "]";
	}
	
}
