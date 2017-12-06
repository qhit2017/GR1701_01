
public class Employees {
	
	
	private String id;
	private String name;
	private double salary;
	private String date;
	private String department;
	
	/**
	 * 
	 */
	public Employees() {
	}

	/**
	 * @param id
	 * @param name
	 * @param string
	 * @param date
	 * @param department
	 */
	public Employees(String id, String name, double string, String date,
			String department) {
		this.id = id;
		this.name = name;
		this.salary = string;
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
