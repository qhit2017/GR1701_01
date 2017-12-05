/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月4日 下午8:16:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package com.zk;

public class Kaoshi {
	private String name;
	private String id;
	private double yu;
	private double shu;
	private double wai;
	private double zong;
	public Kaoshi(String name, String id, double yu, double shu, double wai) {
		this.name = name;
		this.id = id;
		this.yu = yu;
		this.shu = shu;
		this.wai = wai;
	}
	public Kaoshi() {
	}
	@Override
	public String toString() {
		return "Kaoshi [name=" + name + ", id=" + id + ", yu=" + yu + ", shu="
				+ shu + ", wai=" + wai + ", zong=" + zong + "]";
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
	public double getYu() {
		return yu;
	}
	public void setYu(double yu) {
		this.yu = yu;
	}
	public double getShu() {
		return shu;
	}
	public void setShu(double shu) {
		this.shu = shu;
	}
	public double getWai() {
		return wai;
	}
	public void setWai(double wai) {
		this.wai = wai;
	}
	public double getZong() {
		return zong;
	}
	

}
