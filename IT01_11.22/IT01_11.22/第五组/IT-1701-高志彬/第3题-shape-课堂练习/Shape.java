package com.shape;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月22日 上午11:09:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public abstract class Shape {
	
	
	//属性
	int side;
	double angle;
	double area;

	//方法
	public abstract double getArea();

	@Override
	public String toString() {
		return "Shape [side=" + side + ", angle=" + angle + ", area=" + area
				+ "]";
	}
	
}
