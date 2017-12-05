package xcs;

public class Student {
	//实体类 JavaBean 描述考生信息
	//1、成员变量，成员属性，私有
	
	private String name;
	private String id;
	private double yuwen;
	private double shuxue;
	private double yingyu;
	private double sum;
	//2、要有有参和无参的构造方法    总分buxuy
	private void student() {
		// TODO Auto-generated method stub

	}

	public Student() {
		super();
		this.name = name;
		this.id = id;
		this.yuwen = yuwen;
		this.shuxue = shuxue;
		this.yingyu = yingyu;
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

	public double getYuwen() {
		return yuwen;
	}

	public void setYuwen(double yuwen) {
		this.yuwen = yuwen;
	}

	public double getShuxue() {
		return shuxue;
	}

	public void setShuxue(double shuxue) {
		this.shuxue = shuxue;
	}

	public double getYingyu() {
		return yingyu;
	}

	public void setYingyu(double yingyu) {
		this.yingyu = yingyu;
	}

	public double getSum() {
		
		 double Sum = yuwen+shuxue+yingyu;
		return Sum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", yuwen=" + yuwen
				+ ", shuxue=" + shuxue + ", yingyu=" + yingyu + ", sum=" + getSum() 
				+ "]";
	}
	

}
