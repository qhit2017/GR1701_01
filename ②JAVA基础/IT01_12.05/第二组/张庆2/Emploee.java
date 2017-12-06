package zhangqing;

public class Emploee {
	private String name;
	private String ID;
	private double salary;
	private String date;
	private String department;

	public Emploee() {

	}

	public Emploee(String name, String iD, double salary, String date,
			String department) {
		super();
		this.name = name;
		ID = iD;
		this.salary = salary;
		this.date = date;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
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
		return "Emploee [name=" + name + ", ID=" + ID + ", salary=" + salary
				+ ", date=" + date + ", department=" + department + "]";
	}
	
}
