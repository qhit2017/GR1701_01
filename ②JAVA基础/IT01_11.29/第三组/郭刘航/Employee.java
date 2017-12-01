package Practice_1129;
/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Employee {

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
	public Employee(String id, String name, double salary, String date,
			String department) {
		super();
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
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", date=" + date + ", department=" + department + "]";
	}
	
	
}
