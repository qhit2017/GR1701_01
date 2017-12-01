/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月29日 上午10:25:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Employees {
	private String id;
	private String name;
	private double salary;
	private String date;
	private String department;
	/**
	 * @param id
	 * @param name
	 * @param salary
	 * @param date
	 * @param department
	 */
	public Employees(String id, String name, double salary, String date,
			String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
		this.department = department;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", date=" + date + ", department=" + department + "]";
	}
	
	
	
	
}
