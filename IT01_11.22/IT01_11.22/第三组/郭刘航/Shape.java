package COM.GLH;
/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public abstract class Shape {

	int side;
	double limit;
	double area;
	
	abstract double getArea();

	@Override
	public String toString() {
		return "Shape [side=" + side + ", limit=" + limit + ", area=" + area
				+ "]";
	}
	
}
