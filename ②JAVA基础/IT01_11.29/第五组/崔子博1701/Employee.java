
public class Employee {
	
	
	private String id;
	private String name;
	private double salary;
	private String date;
	private String deparment;
	

	public Employee(String id, String name, double salary, String date,
			String deparment) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
		this.deparment = deparment;
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
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", date=" + date + ", deparment=" + deparment + "]";
	}

	
	
}
