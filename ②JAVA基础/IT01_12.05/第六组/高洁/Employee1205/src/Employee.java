/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年12月5日 下午7:13:13
 */
public class Employee {
	
	
	private String id;
	
	private String name;
	
	private double xinshui;
	
	private String shijian;
	
	private String bumen;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String id, String name, double xinshui, String shijian,
			String bumen) {
		super();
		this.id = id;
		this.name = name;
		this.xinshui = xinshui;
		this.shijian = shijian;
		this.bumen = bumen;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", xinshui=" + xinshui
				+ ", shijian=" + shijian + ", bumen=" + bumen + "]";
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

	public double getXinshui() {
		return xinshui;
	}

	public void setXinshui(double xinshui) {
		this.xinshui = xinshui;
	}

	public String getShijian() {
		return shijian;
	}

	public void setShijian(String shijian) {
		this.shijian = shijian;
	}

	public String getBumen() {
		return bumen;
	}

	public void setBumen(String bumen) {
		this.bumen = bumen;
	}

	
}
