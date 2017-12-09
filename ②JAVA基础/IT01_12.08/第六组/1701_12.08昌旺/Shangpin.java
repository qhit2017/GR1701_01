/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月5日 下午8:29:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package zk.qhit.com;

public class Shangpin {
	private String id;
	private String name;
	private double jiage;
	private int shuliang;
	public Shangpin(String id, String name, double jiage, int shuliang) {
		this.id = id;
		this.name = name;
		this.jiage = jiage;
		this.shuliang = shuliang;
	}
	public Shangpin() {
	}
	@Override
	public String toString() {
		return "Shangpin [id=" + id + ", name=" + name + ", jiage=" + jiage
				+ ", shuliang=" + shuliang + "]";
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
	public double getJiage() {
		return jiage;
	}
	public void setJiage(double jiage) {
		this.jiage = jiage;
	}
	public int getShuliang() {
		return shuliang;
	}
	public void setShuliang(int shuliang) {
		this.shuliang = shuliang;
	}
	

}
