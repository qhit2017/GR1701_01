package Commodity;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Commodity {

	private String id;
	private String name;
	private double price;
	private long number;
	
	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param number
	 */
	public Commodity(String id, String name, double price, long number) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
	}
	
	/**
	 * 
	 */
	public Commodity() {
		super();
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
	public void setNumber(long number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", price=" + price
				+ ", number=" + number + "]";
	}
	
	
}
